package com.sunbeam;

public class Program01 {
	// variable arity/argument method
	public static void add(int... arr) {
		int result = 0;
		for (int element : arr)
			result += element;
		System.out.println("Addition - " + result);
	}

	public static void main(String[] args) {
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);
		add(10, 20, 30, 40, 50);

	}

//	public static void add(int[] arr) {
//	int result = 0;
//	for(int element : arr)
//		result+=element;
//	System.out.println("Addition - "+result);
//}

	public static void main1(String[] args) {
		int arr1[] = { 10, 20 };
		int arr2[] = { 10, 20, 30 };
		int arr3[] = { 10, 20, 30, 40 };
		add(arr1);
		add(arr2);
		add(arr3);

	}

}
