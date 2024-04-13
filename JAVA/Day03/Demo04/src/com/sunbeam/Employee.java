package com.sunbeam;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("Inside Parameterless Ctor");
		name = "";
		salary = 100;
	}
	
	public Employee(int empid, String name, double salary) {
		System.out.println("Inside Parameterized Ctor");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	// facilitator
	public void displayEmployee() {
		System.out.println("Empid - "+empid);
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);
	}
	
	//setter
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// getters
	public double getSalary() {
		return salary;
	}

}
