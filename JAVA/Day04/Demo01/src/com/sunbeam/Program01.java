package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {

		int arr[]; // reference
		arr = new int[5]; // object of array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		

		System.out.println("value at index 2 : arr[2] - " + arr[2]);
//		System.out.println("value at index 5 : arr[5] - "+arr[5]); // ArrayIndexOutOfBoundsException

		System.out.println("Using for --->");
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			System.out.println("Element at index " + i + " - " + element);
		}

		System.out.println("Using for-each --->");
		for(int element:arr)
			System.out.println("Element - " + element);
			
	}

}
