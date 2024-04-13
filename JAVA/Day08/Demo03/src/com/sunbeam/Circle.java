package com.sunbeam;

import java.util.Scanner;

public class Circle extends Shape {
	private int radius;

	@Override
	public void acceptData(Scanner sc) {
		System.out.print("Enter radius - ");
		radius = sc.nextInt();
	}

	@Override
	public void calculateArea() {
		double area = 3.14 * radius * radius;
		setArea(area);
	}

}
