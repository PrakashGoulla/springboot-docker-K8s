package com.pramati.product.dao;

import java.util.List;
import java.util.Optional;

import com.pramati.product.dto.ProductRequest;
import com.pramati.product.dto.ProductResponse;

public interface ProductDAO {

	public List<ProductResponse> findAll();

	public Optional<ProductResponse> findById(int id);

	public ProductResponse create(ProductRequest product);

	public ProductResponse update(ProductRequest product, int id);

}
