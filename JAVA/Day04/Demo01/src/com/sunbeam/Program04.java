package com.sunbeam;

public class Program04 {

	public static void main(String[] args) {
	
		int arr[][]; // reference
		arr = new int[2][]; 
		
		//ragged array
		arr[0] = new int[2];
		arr[1] = new int[3];
		
		// 1st Dimension 0th index
		arr[0][0]=10;
		arr[0][1]=20;

		
		// 1st Dimension 1st index
		arr[1][0]=30;
		arr[1][1]=40;
		arr[1][2]=50;
		
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
