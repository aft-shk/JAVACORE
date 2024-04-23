package com.inputhandlingdemo;
import java.util.Scanner;

public class forloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accept a number and display the factorial
		int num,fact=1;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter a number:");
		num=in.nextInt();
		
		for(int count=num;count>=1;count--)
		{
			fact*=count;  //fact=fact*count;
		}
		
		System.out.println("the factorial of "+num+ " is "+ fact);

	}

}
