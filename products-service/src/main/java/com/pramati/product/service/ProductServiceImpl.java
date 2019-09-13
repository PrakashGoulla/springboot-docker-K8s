package com.pramati.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.pramati.product.dao.ProductDAO;
import com.pramati.product.dto.ProductRequest;
import com.pramati.product.dto.ProductResponse;
import com.pramati.product.entity.Product;
import com.pramati.product.exception.ProductNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;

	@Override
	public List<Product> getProductsByCategory(String category) {
		return null;
	}

	@Override
	public ProductResponse getProductById(int id) {
		Assert.isTrue(id > 0, "Invalid product id sent in the request");
		return productDao.findById(id).orElseThrow(() -> new ProductNotFoundException("No Product found with given Id"));
	}

	@Override
	public List<ProductResponse> getAllProducts() {
		return productDao.findAll();
	}

	@Override
	public ProductResponse addProduct(ProductRequest product) {
		return productDao.create(product);
	}

}
