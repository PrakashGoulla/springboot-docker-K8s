package com.pramati.product.service;

import java.util.List;

import com.pramati.product.model.Product;

public interface ProductService {
	
	public List<Product> getProductsByCategory(String category);
	
	public Product getProductByCode(String code);
	
	public List<Product> getAllProducts();

}
