package com.pramati.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pramati.order.entity.Order;

@Repository
public interface JPAOrderRepository extends CrudRepository<Order, Long> {

	public List<Order> findAll();

	public Optional<Order> findFirstByProductId(int productId);
	
	public Optional<Order> findById(long id);

}
