package com.qsp.employee_management_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.qsp.employee_management_system.util.ResponseStructure;
@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleIdNOtFoundException(IdNotFoundException ex) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMessage("Id Not Found");
		structure.setData(ex.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
}
