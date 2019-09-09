package com.pramati.order.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pramati.order.entity.Order;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Order> findAll() {
		return em.createQuery("SELECT o FROM Order o", Order.class).getResultList();
	}

	@Override
	public Optional<Order> findOrderByProductId(int productId) {
		Order order = em.createQuery("SELECT o FROM Order o WHERE o.productId = :productId", Order.class)
				.setParameter("productId", productId).getSingleResult();
		return Optional.ofNullable(order);
	}

	@Override
	public Order createOrder(Order order) {
		return em.merge(order);
	}

}
