package com.invalidexceptionclass;

@SuppressWarnings("serial")
public class InvalidPollutionLevel extends Exception  {

	public InvalidPollutionLevel(String mesg) {
		super(mesg);
	}
}
