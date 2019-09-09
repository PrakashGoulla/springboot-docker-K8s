package com.pramati.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramati.product.dao.ProductDAO;
import com.pramati.product.dto.ProductRequest;
import com.pramati.product.dto.ProductResponse;
import com.pramati.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;

	@Override
	public List<Product> getProductsByCategory(String category) {
		return null;
	}

	@Override
	public Optional<ProductResponse> getProductById(int id) {
		return productDao.findById(id);
	}

	@Override
	public List<ProductResponse> getAllProducts() {
		return productDao.findAll();
	}

	@Override
	public ProductResponse addProduct(ProductRequest productEntity) {
		return productDao.create(productEntity);
	}

}
