package com.sunbeam;

import java.util.Scanner;

public class Student extends Person {
	private int rollno;
	private double marks;

	public Student() {
		System.out.println("Student()");
	}

	public Student(int rollno, String name, double marks) {
		super(name);
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public void acceptData(Scanner sc) {
		System.out.println("Enter rollno - ");
		rollno = sc.nextInt();
		super.acceptData(sc);
		System.out.println("Enter marks - ");
		marks = sc.nextDouble();
	}

	@Override
	public void displayData() {
		System.out.println("Rollno - " + rollno);
		super.displayData();
		System.out.println("Marks - " + marks);
	}

	public void calulatePercent() {
		double percent = (marks / 150) * 100;
		System.out.println("Percentage - " + percent + " % ");
	}

}
