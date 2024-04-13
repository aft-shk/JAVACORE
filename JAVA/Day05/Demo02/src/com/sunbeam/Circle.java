package com.sunbeam;

public class Circle {
	
	int radius;
	// initialization of final field can be done in field initializer
	//final double PI=3.14;
	final double PI;
	
	// object initializer
	{
		// initializtion of final field can be done in Object initializer
		//PI = 3.14;
	}
	
	public Circle() {
		// initialization of final field can be done in Constructor
		PI = 3.14;
	}
	
	void calculateArea() {
		// initialization of final fields cannot be done in other methods
		//PI = 3.14; // NOT OK
	}
	
}
