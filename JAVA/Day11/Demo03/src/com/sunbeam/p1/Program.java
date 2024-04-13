package com.sunbeam.p1;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		// int arr2[] = { 33, 11, 22, 44, 55 };

		Employee arr[] = new Employee[5];
		arr[0] = new Employee(2, "Prashant", 7000);
		arr[1] = new Employee(1, "Rahul", 2000);
		arr[2] = new Employee(3, "Pratik", 4000);
		arr[3] = new Employee(5, "Onkar", 2500);
		arr[4] = new Employee(4, "Vrushab", 3000);

		System.out.println("Before Sorting--");
		for (Employee element : arr)
			System.out.println(element);

		Arrays.sort(arr); // sorting the employees as per natural ordering

		System.out.println("After Sorting--");
		for (Employee element : arr)
			System.out.println(element);
	}

}
