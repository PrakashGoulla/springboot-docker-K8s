package com.pramati.order.dao;

import java.util.List;
import java.util.Optional;

import com.pramati.order.dto.OrderRequest;
import com.pramati.order.dto.OrderResponse;

public interface OrderDAO {

	OrderResponse getOrderByProductId(int productId);

	List<OrderResponse> getAllOrders();

	OrderResponse createOrder(OrderRequest order);

	OrderResponse getOrder(long id);

}
