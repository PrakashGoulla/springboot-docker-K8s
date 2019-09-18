package com.pramati.product.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductExceptionHandler.class);

	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(RuntimeException.class)
	public void handleRuntimeExceptions() {
	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "An unknown error ocurred while processing the request")
	@ExceptionHandler(IllegalArgumentException.class)
	public void handle(RuntimeException e) {
		LOGGER.error("An unknown error ocurred while processing the request", e);
	}

}
