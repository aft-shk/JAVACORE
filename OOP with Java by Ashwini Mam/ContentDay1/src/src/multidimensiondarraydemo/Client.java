package multidimensiondarraydemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr; //reference of an array
		arr=new int[3][3];
		Scanner in=new Scanner(System.in);
		
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("enter the element:");
				arr[r][c]=in.nextInt();
			}
		}
		for(int r=0;r<3;r++)
		{
			System.out.println();
			for(int c=0;c<3;c++)
			{
				System.out.print(arr[r][c]);
			}
		}

	}

}
