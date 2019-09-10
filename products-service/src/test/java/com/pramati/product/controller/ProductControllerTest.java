package com.pramati.product.controller;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.pramati.product.dto.ProductResponse;
import com.pramati.product.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductControllerTest {

	@InjectMocks
	private ProductController productController;

	@Mock
	private ProductService productService;

	private MockMvc mockmvc;

	@Before
	public void setup() {
		initMocks(this);
		this.mockmvc = MockMvcBuilders.standaloneSetup(productController).build();
	}

	@Test
	public void shouldGetProductById() throws Exception {

		final ProductResponse product = new ProductResponse();
		product.setName("test");
		product.setId(1);

		when(productService.getProductById(product.getId())).thenReturn(Optional.of(product));

		mockmvc.perform(get("/api/v1/product/" + product.getId()))
				.andExpect(jsonPath("$.name").value(product.getName())).andExpect(status().isOk());
	}

}
