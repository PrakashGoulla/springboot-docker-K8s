package com.pramati.order.service;

import java.util.List;

import com.pramati.order.model.Order;

public interface OrderService {
	
	public Order getOrderByProductId(String productId);
	
	public List<Order> getAllOrders();

	public Order createOrder(Order order);
	
	public Order updateOrder(Order order);
	
}
