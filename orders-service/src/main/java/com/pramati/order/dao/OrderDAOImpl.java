package com.pramati.order.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pramati.order.client.ProductServiceClient;
import com.pramati.order.dto.OrderRequest;
import com.pramati.order.dto.OrderResponse;
import com.pramati.order.dto.OrderStatus;
import com.pramati.order.dto.ProductDTO;
import com.pramati.order.entity.Order;
import com.pramati.order.exception.OrderNotFoundException;
import com.pramati.order.repository.JPAOrderRepository;

@Transactional
@Component
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private JPAOrderRepository orderRepository;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private ProductServiceClient productService;

	@Override
	public Optional<OrderResponse> getOrderByProductId(int productId) {
		Optional<OrderResponse> response = orderRepository.findFirstByProductId(productId)
				.map(order -> mapper.map(order, OrderResponse.class));
		return response;
	}

	@Override
	public List<OrderResponse> getAllOrders() {
		return orderRepository.findAll().stream().map(order -> mapper.map(order, OrderResponse.class))
				.collect(Collectors.toList());
	}

	@Override
	public OrderResponse createOrder(OrderRequest order) {
		OrderResponse response = new OrderResponse();
		int productId = order.getProductId();
		Order newOrder = mapper.map(order, Order.class);
		ProductDTO product = productService.getProduct(productId);
		if (product.getAvailableQuantity() > 0) {
			newOrder.setOrderPrice(product.getProductPrice());
			newOrder.setOrderStatus(OrderStatus.NEW);
			Order createdOrder = orderRepository.save(newOrder);

			// Update the product quantity, can be an inventory service
			product.setAvailableQuantity(product.getAvailableQuantity() - 1);
//			productService.updateProductQuantity(product);

			response = mapper.map(createdOrder, OrderResponse.class);
		}

		return response;
	}

	@Override
	public OrderResponse getOrder(long id) {
		OrderResponse response = new OrderResponse();
		Order order = orderRepository.findById(id)
				.orElseThrow(() -> new OrderNotFoundException("No order found with give Order id"));
		response = mapper.map(order, OrderResponse.class);

		return response;
	}

}
