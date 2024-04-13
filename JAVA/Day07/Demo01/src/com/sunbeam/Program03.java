package com.sunbeam;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Employee(); // upcasting
		p.acceptData(sc);
		p.displayData();

		if (p instanceof Employee) {
			Employee e = (Employee) p; // Downcasting
			e.salaryAfterTax();
		}
		if (p instanceof Student) {
			Student s = (Student) p; // Downcasting
			s.calulatePercent();
		}

		Object obj = new Person();

	}

}
