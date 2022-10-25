package com.vicky.exception;

public class AgeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public AgeException() {
	}

	public AgeException(String message) {
		super();
		this.message = message;
	}
	
	

	
	
}
