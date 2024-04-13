package com.sunbeam.exceptions;

//checked custom exception class
public class InvalidTimeException extends Exception {
	private String field;
	private String message;

	public InvalidTimeException() {
		field = "";
		message = "";
	}

	public InvalidTimeException(String message) {
		this.field = "";
		this.message = message;
	}

	public InvalidTimeException(String field, String message) {
		this.field = field;
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		System.err.println("Exception :");
		System.err.println("InvalidTimeException : " + message);
		System.err.println("Field :" + field);
	}

}
