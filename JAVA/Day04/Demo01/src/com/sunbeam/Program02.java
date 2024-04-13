package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {

		int arr1[] = new int[5];
		int arr2[] = new int[5];

		System.out.println("Using for-loop for arr1 -->");
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = 10 * (i + 1);

		for (int i = 0; i < arr1.length; i++)
			System.out.println("Element at " + i + " - " + arr1[i]);

		System.out.println("Using for-each for arr2 -->");
		
		int i = 1;
		for (int element : arr2)
			element = 10*i++;
	
		for(int element:arr2)
			System.out.println("Element - "+element);
	}

}
