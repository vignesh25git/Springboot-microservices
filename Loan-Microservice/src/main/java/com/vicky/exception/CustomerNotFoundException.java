package com.vicky.exception;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public String message;
	
	public CustomerNotFoundException() {
		super();
	}

	public CustomerNotFoundException(String message) {
		super(message);
		this.message = message;
	}

}
