package com.pramati.product.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pramati.product.entity.Product;

@Repository
public interface JPAProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findAll();

	public List<Product> findByCategory(String category);

	public Optional<Product> findById(String code);

}
