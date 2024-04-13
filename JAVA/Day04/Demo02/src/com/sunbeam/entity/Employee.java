package com.sunbeam.entity;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empid - ");
		empid = sc.nextInt();
		System.out.println("Enter name - ");
		name = sc.next();
		System.out.println("Enter salary - ");
		salary = sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Empid - "+empid);
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);
	}
	
}
