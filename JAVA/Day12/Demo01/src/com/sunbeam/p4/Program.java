package com.sunbeam.p4;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(3, "vrushab", 3500);
		arr[1] = new Employee(1, "rahul", 4000);
		arr[2] = new Employee(2, "prashant", 5000);
		arr[3] = new Employee(5, "pratik", 3000);
		arr[4] = new Employee(4, "onkar", 3500);

		System.out.println("Before Sorting -");
		for (Employee employee : arr)
			System.out.println(employee);

		// sort the array based on employee salary in desc order and
		// name in asc order
		Arrays.sort(arr);

		System.out.println("After Sorting -");
		for (Employee employee : arr)
			System.out.println(employee);
	}
}
