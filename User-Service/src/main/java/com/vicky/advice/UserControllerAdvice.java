package com.vicky.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vicky.exception.UserNotFoundException;

@RestControllerAdvice
public class UserControllerAdvice {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException userNotFoundException) {
		return new ResponseEntity<String>("requested User not found in database..please try with different id",
				HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<String> handleMethodNotSupported(
			HttpRequestMethodNotSupportedException httpRequestMethodNotSupportedException) {

		return new ResponseEntity<String>("Incorrect Methor Request... please use the proper get/post",
				HttpStatus.METHOD_NOT_ALLOWED);
	}

}
