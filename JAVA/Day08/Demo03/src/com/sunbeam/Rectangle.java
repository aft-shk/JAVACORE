package com.sunbeam;

import java.util.Scanner;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	@Override
	public void acceptData(Scanner sc) {
		System.out.print("Enter length - ");
		length = sc.nextInt();
		System.out.print("Enter breadth - ");
		breadth = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		setArea(length * breadth);
	}

	@Override
	public void displayArea() {
		System.out.println("Area of Rectangle - " + getArea());
	}

}
