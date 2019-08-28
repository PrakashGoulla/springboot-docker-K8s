package com.pramati.product.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pramati.product.model.Product;

@Repository
public interface JPAProductRepository extends CrudRepository<Product, Integer> {

	public List<Product> findAll();

	public List<Product> findByProductCategory(String category);
	
	public Product findByProductCode(String code);

}
