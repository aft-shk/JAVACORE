package com.sunbeam;

import java.util.Scanner;

public class Program05 {

	public static void division(int numerator, int denominator) {
		System.out.println("Division - " + (numerator / denominator));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the value for numerator - ");
			int num = sc.nextInt();

			System.out.print("Enter the value for denominator - ");
			int deno = sc.nextInt();

			division(num, deno);

		} catch (Exception e)// Generic Catch Block
		{
			e.printStackTrace();
		}
		System.out.println("Program Executed Successfully");
	}

}
