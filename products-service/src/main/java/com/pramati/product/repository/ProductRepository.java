package com.pramati.product.repository;

import java.util.List;

import com.pramati.product.model.Product;

public interface ProductRepository {

	public List<Product> findProductsByCategory(String category);
	
	public Product findProductByCode(String code);

}
