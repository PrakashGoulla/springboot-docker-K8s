package com.pramati.product.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pramati.product.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager em;

	public List<Product> findAll() {
		return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
	}

	@Override
	public List<Product> findByCategory(String category) {
		return null;
	}

	@Override
	public Optional<Product> findById(int code) {
		Product p = em.find(Product.class, code);
		return Optional.ofNullable(p);
	}

	@Override
	public void addProduct(Product productEntity) {
		em.persist(productEntity);
	}

}
