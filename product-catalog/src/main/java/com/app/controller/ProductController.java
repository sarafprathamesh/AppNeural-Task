package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Product;
import com.app.service.ProductService;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@CrossOrigin(origins = "*")
	@GetMapping("/api/products")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Product> getAllProducts() {

		return service.getAllProducts();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/products/add")
	@ResponseStatus(code = HttpStatus.OK)
	public Product addProduct(@RequestBody Product product) {

		return service.addProduct(product);
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/api/products/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public String deleteProduct(@PathVariable int id) {

		return service.deleteProduct(id);
	}
	
	
}
