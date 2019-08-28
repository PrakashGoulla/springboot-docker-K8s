package com.pramati.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.product.model.Product;
import com.pramati.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping(value = "", params="code", method = RequestMethod.GET)
	public Product getProductByCode(@RequestParam String code) {
		return productService.getProductByCode(code);
	}

	@RequestMapping(value = "/{category}", method = RequestMethod.GET)
	public List<Product> getProductsByCategory(@PathVariable String category) {
		return productService.getProductsByCategory(category);
	}


	@RequestMapping(value = "", method = RequestMethod.POST)
	public Product createProduct() {
		return null;
	}

}
