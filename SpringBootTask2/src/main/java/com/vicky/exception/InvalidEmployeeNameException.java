package com.vicky.exception;

public class InvalidEmployeeNameException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public InvalidEmployeeNameException() {
		
	}
	
	public InvalidEmployeeNameException(String message) {
		
		super(message);
		this.message=message;
		
	}

}
