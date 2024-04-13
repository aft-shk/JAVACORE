package com.sunbeam;

public abstract class Shape implements Acceptable {

	private double area;

	public void setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void displayArea() {
		System.out.println("Area -  " + area);
	}

	// public abstract void acceptData(Scanner sc);

	public abstract void calculateArea();

}
