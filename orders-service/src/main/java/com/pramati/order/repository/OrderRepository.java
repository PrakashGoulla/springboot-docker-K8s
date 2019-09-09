package com.pramati.order.repository;

import java.util.List;
import java.util.Optional;

import com.pramati.order.entity.Order;

public interface OrderRepository {

	public List<Order> findAll();

	public Optional<Order> findOrderByProductId(int productId);
	
	public Order createOrder(Order order);

}
