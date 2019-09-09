package com.pramati.order.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramati.order.dao.OrderDAO;
import com.pramati.order.dto.OrderRequest;
import com.pramati.order.dto.OrderResponse;
import com.pramati.order.entity.Order;
import com.pramati.order.repository.JPAOrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDao;

	@Override
	public Optional<OrderResponse> getOrderByProductId(int productId) {
		return orderDao.getOrderByProductId(productId);
	}

	@Override
	public List<OrderResponse> getAllOrders() {
		return orderDao.getAllOrders();
	}

	@Override
	public OrderResponse createOrder(OrderRequest order) {
		return orderDao.createOrder(order);
	}

	@Override
	public Order updateOrder(Order order) {
		return new Order();
	}

}
