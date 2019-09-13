package com.pramati.product.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pramati.product.client.OrderServiceClient;
import com.pramati.product.dto.OrderDTO;
import com.pramati.product.dto.ProductRequest;
import com.pramati.product.dto.ProductResponse;
import com.pramati.product.entity.Product;
import com.pramati.product.repository.JPAProductRepository;

@Transactional
@Component
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JPAProductRepository productRepository;

	@Autowired
	private OrderServiceClient orderService;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<ProductResponse> findAll() {
		return productRepository.findAll().stream().map(product -> mapper.map(product, ProductResponse.class))
				.collect(Collectors.toList());
	}

	@Override
	public Optional<ProductResponse> findById(int id) {
		Optional<ProductResponse> response = productRepository.findById(id)
				.map(product -> mapper.map(product, ProductResponse.class));
		OrderDTO orderHistory = orderService.getOrderHistory(response.get().getId());
		response.get().setOrderHistory(orderHistory);
		return response;
	}

	@Override
	public ProductResponse create(ProductRequest product) {
		Product productEntity = mapper.map(product, Product.class);
		Product createdProduct = productRepository.save(productEntity);
		ProductResponse response = mapper.map(createdProduct, ProductResponse.class);
		return response;
	}

}
