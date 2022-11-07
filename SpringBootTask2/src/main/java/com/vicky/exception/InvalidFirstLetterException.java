package com.vicky.exception;

public class InvalidFirstLetterException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String message;

	public InvalidFirstLetterException() {
		super();
	}

	public InvalidFirstLetterException(String message) {
		super(message);
		this.message = message;
	}

}
