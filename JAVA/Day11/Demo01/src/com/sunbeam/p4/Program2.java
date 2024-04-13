package com.sunbeam.p4;

import java.util.Date;

public class Program2 {
	// unbounded type -> class reference
	public static void display(Box<? super Integer> b) {
		Object obj = b.getObj();
		System.out.println("obj - " + obj);
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(10);
		display(b1);

		Box<Double> b2 = new Box<>(10.20);
		// display(b2); // NOT OK

		Box<String> b3 = new Box<>("sunbeam");
		// display(b3); // error

		Box<Date> b4 = new Box<>(new Date());
		// display(b4);// error

		Box<Number> b5 = new Box<>(10.20);
		display(b5);

	}
}
