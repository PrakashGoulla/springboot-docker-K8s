package com.pramati.order.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pramati.order.dto.ProductDTO;

@Component
public class ProductServiceClientFallback implements ProductServiceClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceClientFallback.class);

	@Override
	public ProductDTO getProduct(int productId) {
		LOGGER.error("An error occurred while getting product information");
		return null;
	}

	@Override
	public ProductDTO updateProductQuantity(ProductDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

}
