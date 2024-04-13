package com.sunbeam.p1;

public class Program {

	public static <T> void displayArray(T[] arr) {
		for (T element : arr)
			System.out.println(element);
	}

	public static void main(String[] args) {
		Integer arr1[] = { 11, 22, 33, 44, 55 };
		displayArray(arr1);

		Double arr2[] = { 11.22, 22.33, 33.44, 44.55 };
		Program.<Double>displayArray(arr2);

		String arr3[] = { "Prashant", "Rahul", "Pratik", "Onkar" };
		displayArray(arr3);
	}

}
