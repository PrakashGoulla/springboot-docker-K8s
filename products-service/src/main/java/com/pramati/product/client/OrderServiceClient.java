package com.pramati.product.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pramati.product.model.Order;

@FeignClient(url="http://localhost:8020")
public interface OrderServiceClient {
	
	@RequestMapping(method = RequestMethod.GET, value="")
	List<Order> getOrderHistory();

}
