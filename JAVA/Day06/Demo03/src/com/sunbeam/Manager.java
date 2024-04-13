package com.sunbeam;

import java.util.Scanner;

public final class Manager extends Employee{
	private double bonus;
	
	@Override
	public void accept() {
		super.accept();
		System.out.print("Enter Bonus - ");
		bonus = new Scanner(System.in).nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Bonus - "+bonus);
	}
	
	// cannot override final method
//	@Override
//	public void testMethod() {
//		// TODO Auto-generated method stub
//		super.testMethod();
//	}
}
