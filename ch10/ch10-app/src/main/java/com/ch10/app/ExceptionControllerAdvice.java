package com.ch10.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//use RestControllerAdvice annotation to mark the class as a REST controller advice
@RestControllerAdvice
public class ExceptionControllerAdvice {
//we use the exception handler to associate an exception with the logic the method implements
	@ExceptionHandler(NotEnoughMoneyException.class)
	public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(){
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setMessage("Not enough money to make the payment");
		return ResponseEntity.badRequest().body(errorDetails);
	}
}
