package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.server.handler.ResponseStatusExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice

public class ValidationHandler extends ResponseEntityExceptionHandler{
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex,HttpHeaders headers,HttpStatus status, WebRequest request){
		
		Map<String, String>errors=new HashMap<String, String>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String key =((FieldError)error).getField();
			String errorMsg= error.getDefaultMessage();
			errors.put(key, errorMsg);
		}
		);
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
		//return handleExceptionInternal(ex, null, headers, status, request);
	}
}
