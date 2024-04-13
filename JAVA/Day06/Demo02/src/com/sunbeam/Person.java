package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	
	public Person() {
		System.out.println("Person()");
	}

	public Person(String name) {
		System.out.println("Person(String)");
		this.name = name;
	}
	
	public void acceptPerson() {
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter name - ");
		//name = sc.next();
		name = new Scanner(System.in).next();
	}
	
	public void displayPerson() {
		System.out.println("Name - "+name);
	}

	
}
