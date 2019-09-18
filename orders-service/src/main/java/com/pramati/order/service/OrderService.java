package com.pramati.order.service;

import java.util.List;
import java.util.Optional;

import com.pramati.order.dto.OrderRequest;
import com.pramati.order.dto.OrderResponse;
import com.pramati.order.entity.Order;

public interface OrderService {

	public OrderResponse getOrderByProductId(int productId);

	public List<OrderResponse> getAllOrders();

	public OrderResponse createOrder(OrderRequest order);

	public Order updateOrder(Order order);

	public OrderResponse getOrder(long id);

}