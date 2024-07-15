package com.app.service;

import java.util.List;

import com.app.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public Product addProduct(Product product);
	
	public String deleteProduct(int productId);

}
