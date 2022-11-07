package com.vicky.exception;

public class InvalidCharacterException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public String message;
	
	public InvalidCharacterException() {
		super();
	}

	public InvalidCharacterException(String message) {
		super(message);
		this.message = message;
	}
	

}
