package com.inputhandlingdemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accept 2 numbers and display the addition
		int num1,num2,result;
		
		//Create an object of Scanner class to get the input 
		//from Console
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		num1=in.nextInt();
		
		System.out.println("Enter number 2:");
		num2=in.nextInt();
		
		result=num1+num2;
		
		System.out.println("the result is"+result);

	}

}
