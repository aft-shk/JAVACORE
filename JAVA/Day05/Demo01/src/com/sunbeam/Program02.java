package com.sunbeam;

public class Program02 {

	public static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}

	public static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

	public static void main(String[] args) {
		int arr[] = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		System.out.println("Before Swapping - ");
		System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		swap(arr);
		System.out.println("After Swapping - ");
		System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
	}

	public static void main1(String[] args) {
		int n1 = 10;
		int n2 = 20;
		System.out.println("Before Swapping - ");
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		swap(n1, n2);
		System.out.println("After Swapping - ");
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
	}

}
