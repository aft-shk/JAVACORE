package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Person p = new Person();
//		p.acceptData(sc);
//		p.displayData();

//		Employee e = new Employee();
//		e.acceptEmployee(sc);
//		e.displayEmployee();
//		sc.close();

//		Person p = new Employee(); // upcasting
//		p.acceptData(sc);
//		p.displayData();

//		Student s = new Student();
		Person p = new Student(); // upcasting
		p.acceptData(sc);
		p.displayData();
	}

}
