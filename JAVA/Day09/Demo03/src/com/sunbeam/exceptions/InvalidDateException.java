package com.sunbeam.exceptions;

//unchecked Exception
public class InvalidDateException extends RuntimeException {
	private String field;
	private String message;

	public InvalidDateException() {
		this.field = "";
		this.message = "";
	}

	public InvalidDateException(String message) {
		this.field = "";
		this.message = message;
	}

	public InvalidDateException(String field, String message) {
		this.field = field;
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		System.err.println("Exception : ");
		System.err.println("InvalidDateException : " + message);
		System.err.println("For the field : " + field);
	}

}
