package com.pramati.order.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.order.model.Order;
import com.pramati.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Order> getAllOrders() {

		return orderService.getAllOrders();
	}

	@RequestMapping(value = "", params = "productId", method = RequestMethod.GET)
	public List<Order> getOrdersByProductId() {
		return null;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Order createOrder(@Valid @RequestBody Order order) {
		return orderService.createOrder(order);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public Order updateOrder(@Valid @RequestBody Order order) {
		return orderService.updateOrder(order);
	}

}
