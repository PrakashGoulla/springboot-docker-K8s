package com.pramati.product.service;

import java.util.List;
import java.util.Optional;

import com.pramati.product.dto.ProductRequest;
import com.pramati.product.dto.ProductResponse;
import com.pramati.product.entity.Product;

public interface ProductService {

	public List<Product> getProductsByCategory(String category);

	public Optional<ProductResponse> getProductById(int id);

	public List<ProductResponse> getAllProducts();

	ProductResponse addProduct(ProductRequest productEntity);

}
