package com.vicky.exception;

public class InvalidEmployeeAgeException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public InvalidEmployeeAgeException() {
	}

	public InvalidEmployeeAgeException(String message) {
		super();
		this.message = message;
	}
	
}
