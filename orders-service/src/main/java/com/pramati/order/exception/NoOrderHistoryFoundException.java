package com.pramati.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NoOrderHistoryFoundException extends RuntimeException {

	private static final long serialVersionUID = -2137830802766704003L;

	public NoOrderHistoryFoundException(String msg) {
		super(msg);
	}

}
