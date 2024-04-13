package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Employee obj = new Employee();// cannot create object of abstract class
//		Employee obj = new Manager(); // upcasting
		Employee obj = new Salesman(); // upcasting
		obj.acceptData(sc);
		obj.displayEmployee();
		obj.calculateTotalSalary();

		sc.close();
	}

}
