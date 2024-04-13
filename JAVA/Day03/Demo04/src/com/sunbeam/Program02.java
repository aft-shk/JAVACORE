package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		Employee e1 = new Employee(); 
		e1.displayEmployee();
		
		Employee e2 = new Employee(1,"rohan",10000);
		e2.displayEmployee();
		
		//e2.salary = 20000; // NOT OK
		e2.setSalary(20000);
		
//		System.out.println("Change salary of e2 = "+e2.salary);
		System.out.println("Change salary of e2 = "+e2.getSalary());
		
	}
	
	public static void main1(String[] args) {
		Employee e1 = new Employee(); // paramterless
		Employee e2 = new Employee(); // parameterless
		
		Employee e3 = new Employee(1,"e1",1000); // parameterized
		
	}

}
