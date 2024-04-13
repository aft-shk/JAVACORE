package com.sunbeam;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
		int arr1[] = {11,22,33,44,55};
		//System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));

		int arr2[] = {20,50,30,40,10};
		System.out.println("Befor Sorting - ");
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		
		System.out.println("After Sorting - ");
		System.out.println(Arrays.toString(arr2));
		
		int index = Arrays.binarySearch(arr2,30);
		System.out.println("Index = "+index);
		
		int arr3[][] = {{11,22,33},{44,55}};
		// to-do ->display using for-loop
		// to-do ->display using for-each
		System.out.println("Display Multi Dimenion Array - ");
		for(int[] element: arr3)
			System.out.println(Arrays.toString(element));
	}

}
