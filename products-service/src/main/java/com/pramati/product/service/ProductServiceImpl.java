package com.pramati.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramati.product.model.Product;
import com.pramati.product.repository.JPAProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private JPAProductRepository productRepository;

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.findByProductCategory(category);
	}

	@Override
	public Product getProductByCode(String code) {
		return productRepository.findByProductCode(code);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

}
