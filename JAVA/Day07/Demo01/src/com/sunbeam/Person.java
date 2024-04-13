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

	public void acceptData(Scanner sc) {
		System.out.print("Enter name - ");
		name = sc.next();
	}

	public void displayData() {
		System.out.println("Name - " + name);
	}

}
