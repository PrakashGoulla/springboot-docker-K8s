package com.pramati.product.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pramati.product.dto.OrderDTO;

@Component
public class OrderServiceClientFallback implements OrderServiceClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceClientFallback.class);

	@Override
	public OrderDTO getOrderHistory(int productId) {
		LOGGER.error("Error ocurred while getting order history");
		return null;
	}

}
