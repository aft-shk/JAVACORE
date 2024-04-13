package com.sunbeam;

class Employee {
	int id;
	String name;
	double salary;

	public void accept() {
		System.out.println("Employee accept");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}

public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = null;
		Employee e3 = null;

		try {
			e2 = (Employee) e1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		e3.accept();

		System.out.println("Program executed successfully");
	}

}
