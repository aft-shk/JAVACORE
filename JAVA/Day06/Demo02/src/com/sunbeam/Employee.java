package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	private int empid;
	private double salary;
	
	public Employee() {
		System.out.println("Employee()");
	}

	
	public Employee(String name, int empid, double salary) {
		super(name);
		System.out.println("Employee(String,int,double)");
		this.empid = empid;
		this.salary = salary;
	}



	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		
		acceptPerson();
		
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}
	public void displayEmployee() {
		System.out.println("Empid - "+empid);
		
		displayPerson();
		
		System.out.println("Salary - "+salary);
	}
	
	
	
}
