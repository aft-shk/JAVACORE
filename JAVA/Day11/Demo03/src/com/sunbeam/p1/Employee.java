package com.sunbeam.p1;

public class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	// providing natural ordering for the employees
	@Override
	public int compareTo(Employee o) {
		int diff = this.empid - o.empid;
		return diff;
	}

}
