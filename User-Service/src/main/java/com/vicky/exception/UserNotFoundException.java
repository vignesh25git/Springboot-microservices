package com.vicky.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public String message;
	
	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
		this.message = message;
	}

}
