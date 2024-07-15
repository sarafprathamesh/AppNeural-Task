package com.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Product;
import com.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public List<Product> getAllProducts() {
		
		return repository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		
		product.setCreatedAt(new Date());
		product.setUpdatedAt(new Date());
		return repository.save(product);
	}

	@Override
	public String deleteProduct(int productId) {
		
		repository.deleteById(productId);
		
		return "Product Deleted Successfully";
	}

}
