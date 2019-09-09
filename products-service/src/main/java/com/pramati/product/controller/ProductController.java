package com.pramati.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.product.dto.ProductRequest;
import com.pramati.product.dto.ProductResponse;
import com.pramati.product.exception.ProductNotFoundException;
import com.pramati.product.service.ProductService;

@RestController
@RequestMapping(path = "/api/v1")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<ProductResponse> getAllProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping(value = "/product/{code}", method = RequestMethod.GET)
	public ProductResponse getProductById(@PathVariable("code") int code) {
		return productService.getProductById(code)
				.orElseThrow(() -> new ProductNotFoundException("No Product found with given Id"));
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public ProductResponse createProduct(@RequestBody @Valid ProductRequest product) {
		return productService.addProduct(product);
	}

}
