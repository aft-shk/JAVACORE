package com.sunbeam;

public class Program03 {

	public static void main(String[] args) {
	
		int arr[][]; // reference
		arr = new int[2][3];
		
		// 1st Dimension 0th index
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		// 1st Dimension 1st index
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println("using for loop -->");
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Element - "+arr[i][j]);
			}
		}
		
		System.out.println("using for each -->");
		for(int[] earr: arr) {
			for(int element : earr)
			{
				System.out.println("Element - "+element);
			}
		}
		
	}

}
