package com.pramati.product.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pramati.product.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@Override
	public List<Product> findProductsByCategory(String category) {
		return null;
	}

	@Override
	public Product findProductByCode(String code) {
		Product p = new Product();
		p.setAvailableQuantity(2);
		p.setId(10);
		p.setName("tets name");
		return p;
	}

}
