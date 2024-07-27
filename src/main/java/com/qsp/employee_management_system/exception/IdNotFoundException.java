package com.qsp.employee_management_system.exception;

public class IdNotFoundException extends RuntimeException {
	private String message;

	public IdNotFoundException(String message) {
		super();
		this.message = message;
	}
@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}	
}
