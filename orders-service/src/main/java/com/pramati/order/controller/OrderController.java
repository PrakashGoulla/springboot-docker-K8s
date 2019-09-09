package com.pramati.order.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.order.dto.OrderRequest;
import com.pramati.order.dto.OrderResponse;
import com.pramati.order.entity.Order;
import com.pramati.order.service.OrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public List<OrderResponse> getAllOrders() {
		return orderService.getAllOrders();
	}

	@RequestMapping(value = "/order", params = "productId", method = RequestMethod.GET)
	public OrderResponse getOrdersByProductId(@RequestParam(name = "productId") int productId) {
		return orderService.getOrderByProductId(productId).get();
	}

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public OrderResponse createOrder(@Valid @RequestBody OrderRequest order) {
		return orderService.createOrder(order);
	}

	
	
	@RequestMapping(value = "/order", method = RequestMethod.PUT)
	public Order updateOrder(@Valid @RequestBody Order order) {
		return orderService.updateOrder(order);
	}

}
