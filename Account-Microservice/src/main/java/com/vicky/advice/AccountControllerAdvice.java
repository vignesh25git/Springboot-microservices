package com.vicky.advice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.vicky.dto.ErrorResponse;
import com.vicky.exception.CustomerNotFoundException;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class AccountControllerAdvice extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleCustomerNotFound(CustomerNotFoundException customerNotFoundException) {
		
		ErrorResponse errorResponse = ErrorResponse.builder()
										.timeStamp(LocalDateTime.now())
										.status(HttpStatus.BAD_REQUEST)
										.code(HttpStatus.BAD_REQUEST.value())
										.message("Customer Not found")
										.errorDetails(Collections.singletonList(customerNotFoundException.getLocalizedMessage()))
										.build();
		
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception ex) {
		
		ErrorResponse errorResponse = ErrorResponse.builder()
										.timeStamp(LocalDateTime.now())
										.status(HttpStatus.BAD_REQUEST)
										.code(HttpStatus.BAD_REQUEST.value())
										.message("Customer Not found")
										.errorDetails(Collections.singletonList(ex.getLocalizedMessage()))
										.build();
		
		ex.printStackTrace();
		
		return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
     @Override
 //	@ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
    		HttpHeaders headers, HttpStatus status, WebRequest request) {
    	// TODO Auto-generated method stub
    	 log.info("Invalid arg");
    	 List<String> errorDetails = new ArrayList<>();
    	 
    	 List<ObjectError> errorlist = ex.getBindingResult().getAllErrors();
    	 
    	 for (ObjectError err :  errorlist) {
    		 errorDetails.add(err.getDefaultMessage());
    	 }
    	
    	 ErrorResponse errorResponse = ErrorResponse.builder()
					.timeStamp(LocalDateTime.now())
					.status(HttpStatus.BAD_REQUEST)
					.code(HttpStatus.BAD_REQUEST.value())
					.message("Method Argument is Invalid..Please have a look!!!!")
					.errorDetails(errorDetails)
					.build();
    	 
    	 
 		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);

//    	return super.handleMethodArgumentNotValid(ex, headers, status, request);
    }

     
}
