package com.pramati.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pramati.order.dto.ProductDTO;

@FeignClient(name = "products", url = "http://localhost:8010", fallback = ProductServiceClientFallback.class)
public interface ProductServiceClient {

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/product/{productId}")
	ProductDTO getProduct(@PathVariable(value = "productId") int productId);

	@RequestMapping(method = RequestMethod.PUT, value = "/api/v1/product/{id}")
	ProductDTO updateProductQuantity(ProductDTO product);

}
