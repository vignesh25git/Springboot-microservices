package com.vicky.exception;

public class InvalidAgeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	

	public InvalidAgeException() {
	}


	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}
	
	
	
	

}
