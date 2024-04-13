package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	private double bonus;

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter bonus - ");
		bonus = sc.nextDouble();
	}

	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Bonus - " + bonus);
	}

	@Override
	public void calculateTotalSalary() {
		System.out.println("Total salary of manager - " + (getSalary() + bonus));
	}
}
