package com.invalidexceptionclass;

@SuppressWarnings("serial")
public class InvalidColor extends Exception{
	public InvalidColor(String mesg) {
		super(mesg);
	}
}
