package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	
	public void accept() {
		System.out.print("Enter name - ");
		name = new Scanner(System.in).next();
	}
	
	public void display() {
		System.out.println("Name - "+name);
	}

	
}
