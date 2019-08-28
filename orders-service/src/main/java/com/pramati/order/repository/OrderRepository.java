package com.pramati.order.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pramati.order.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

	public List<Order> findAll();

	public Order findOrderByProductId(String productId);

}
