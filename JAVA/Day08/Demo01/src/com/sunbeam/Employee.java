package com.sunbeam;

import java.util.Scanner;

import com.sunbeam.interfaces.Acceptable;

public abstract class Employee implements Acceptable {
	private int empid;
	private double salary;

	public Employee() {
	}

	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public void acceptData(Scanner sc) {
		System.out.print("Enter empid -  ");
		empid = sc.nextInt();
		System.out.print("Enter salary -  ");
		salary = sc.nextDouble();
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Salary - " + salary);
	}

	// abstract method
	public abstract void calculateTotalSalary(); // 100% incomplete
	// virtual void calculateTotalSalary()=0; // 100% incomplete

}
