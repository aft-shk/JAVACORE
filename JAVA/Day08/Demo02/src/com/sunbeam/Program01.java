package com.sunbeam;

interface Accecptable {
	void acceptData();
}

interface Printable {
	void displayData();
}

class Employee implements Accecptable, Printable {

	@Override
	public void displayData() {
		System.out.println("Employee display");
	}

	@Override
	public void acceptData() {
		System.out.println("Employee accept");

	}

}

class Circle implements Accecptable, Printable {

	@Override
	public void displayData() {
		System.out.println("Circle display");

	}

	@Override
	public void acceptData() {

		System.out.println("Circle accept");
	}

}

public class Program01 {

	public static void main(String[] args) {
		Accecptable a1 = new Employee();
		Accecptable a2 = new Circle();

		a1.acceptData();
		a2.acceptData();

		Printable p1 = new Employee();
		Printable p2 = new Circle();

		p1.displayData();
		p2.displayData();
	}

}
