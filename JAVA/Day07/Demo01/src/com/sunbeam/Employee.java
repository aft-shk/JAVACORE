package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	private int empid;
	private double salary;

	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(int empid, String name, double salary) {
		super(name);
		System.out.println("Employee(int,String,double)");
		this.empid = empid;
		this.salary = salary;
	}

	public void acceptData(Scanner sc) {
		System.out.print("Enter empid - ");
		empid = sc.nextInt();

		super.acceptData(sc);

		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}

	public void displayData() {
		System.out.println("Empid - " + empid);

		super.displayData();

		System.out.println("Salary - " + salary);

	}

	public void salaryAfterTax() {
		double salary = (this.salary - this.salary * 0.1);
		System.out.println("Salary after TDS - " + salary);
	}

}
