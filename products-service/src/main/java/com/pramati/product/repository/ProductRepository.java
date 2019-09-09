package com.pramati.product.repository;

import java.util.List;
import java.util.Optional;

import com.pramati.product.entity.Product;

public interface ProductRepository {

	public List<Product> findAll();

	public List<Product> findByCategory(String category);

	public Optional<Product> findById(int code);

	public void addProduct(Product productEntity);

}
