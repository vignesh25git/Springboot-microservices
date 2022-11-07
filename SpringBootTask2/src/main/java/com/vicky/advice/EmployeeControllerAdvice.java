package com.vicky.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vicky.exception.InvalidAgeException;
import com.vicky.exception.InvalidCharacterException;
import com.vicky.exception.InvalidFirstLetterException;

@RestControllerAdvice
public class EmployeeControllerAdvice {
	
	@ExceptionHandler(InvalidCharacterException.class)
	public ResponseEntity<String> handleInvalidCharacter(InvalidCharacterException invalidEmployeeException) {
		
		return new ResponseEntity<String>("Employee name should not contain Special Character ",HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(InvalidFirstLetterException.class)
	public ResponseEntity<String> handleCapitalLetter(InvalidFirstLetterException invalidFirstLetterException){
		
		return new ResponseEntity<String>("Employee Name should starts with Capital Letter ",HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(InvalidAgeException.class)
	public ResponseEntity<String> handleInvalidAge(InvalidAgeException invalidAgeException ){
		
		return new ResponseEntity<String>("Employee Age should be inbetween 1 to 44 ",HttpStatus.BAD_REQUEST);
		
	}
	

}
