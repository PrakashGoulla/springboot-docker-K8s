package com.pramati.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pramati.product.dto.OrderDTO;

@FeignClient(name = "orders", url = "http://localhost:8020", fallback = OrderServiceClientFallback.class)
public interface OrderServiceClient {

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/order")
	OrderDTO getOrderHistory(@RequestParam(value = "productId") int productId);

}
