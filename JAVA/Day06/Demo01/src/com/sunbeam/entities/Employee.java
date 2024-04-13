package com.sunbeam.entities;

import java.util.Scanner;

// Employee has-a doj(Date)
// Employee has-a car (Car)
public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	// Association -> Aggegration
	private Car car;
	
	// Association -> Composition
	private Date doj;// = new Date(); OR (Field Initializer)
	
	
	// object initializer
	{
		//doj = new Date(); OR
	}
	
	public Employee() {
		doj = new Date();
		System.out.println("Employee()");
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void acceptEmployee() {
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		System.out.print("Enter name - ");
		name = sc.next();
		System.out.print("Enter Salary - ");
		salary = sc.nextDouble();
		System.out.println("Enter date of joining - ");
		doj.acceptDate();
	}
	
	public void displayEmployee() {
		System.out.println("Empid - "+empid);
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);
		System.out.print("Date of joining - ");
		doj.displayDate();
		if(car != null)
			car.displayCar();
	}
	
	
}
