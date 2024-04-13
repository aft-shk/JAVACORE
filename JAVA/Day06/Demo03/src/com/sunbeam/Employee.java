package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	private int empid;
	private double salary;


	// Redefining the same method of super class once again in sub class
	// with same name and signature is called as method overriding
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		
		// to call the methods of super class use the keyword super.
		// it is only required when the name of the methods are same
		// i.e when method overriding is done.
		super.accept();
		
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}

	public void display() {
		System.out.println("Empid - "+empid);
		
		super.display();
		
		System.out.println("Salary - "+salary);
	}
	
	public final void testMethod() {
		
	}
	
	
	
}
