package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	private double comm;

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.print("Enter the commission - ");
		comm = sc.nextDouble();
	}

	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Commission - " + comm);
	}

	@Override
	public void calculateTotalSalary() {
		double commAmount = (getSalary() * comm) / 100;
		System.out.println("Total salary of salesman - " + (getSalary() + commAmount));

	}

}
