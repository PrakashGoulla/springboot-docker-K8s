package com.pramati.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pramati.product.dto.OrderDTO;

@FeignClient(name = "orders", url = "http://orders-svc:8081", fallback = OrderServiceClientFallback.class)
public interface OrderServiceClient {

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/order/history/{productId}")
	OrderDTO getOrderHistory(@PathVariable(value = "productId") int productId);

}
