package com.sunbeam.entity;

public class Student {
	private int rollno;
	private String name;
	private double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Rollno - "+rollno);
		System.out.println("Name - "+name);
		System.out.println("Marks - "+marks);
	}
	
}
