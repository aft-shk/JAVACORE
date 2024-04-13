package com.sunbeam.tester;

import com.sunbeam.entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee []arr; // reference
		arr = new Employee[3];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = new Employee();
			arr[i].accept();
		}
		
		for(int i=0; i<arr.length;i++) {
			arr[i].display();
		}

	}

}
