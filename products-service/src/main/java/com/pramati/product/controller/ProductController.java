package com.pramati.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.product.dto.ProductRequest;
import com.pramati.product.dto.ProductResponse;
import com.pramati.product.service.ProductService;

@RestController
@RequestMapping(path = "/api/v1")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/product")
	public List<ProductResponse> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping(value = "/product/{code}")
	public ProductResponse getProductById(@PathVariable("code") int code) {
		return productService.getProductById(code);
	}

	@PostMapping(value = "/product")
	public ProductResponse createProduct(@RequestBody @Valid ProductRequest product) {
		return productService.addProduct(product);
	}

	@PutMapping(value = "/product/{id}")
	public ProductResponse updateProduct(@RequestBody @Valid ProductRequest product, @PathVariable("id") int id) {
		return productService.updateProduct(product, id);
	}

}
