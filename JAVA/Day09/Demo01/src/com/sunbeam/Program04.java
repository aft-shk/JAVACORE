package com.sunbeam;

import java.util.Scanner;

public class Program04 {

	public static void division(int numerator, int denominator) {
		System.out.println("Division - " + (numerator / denominator));
	}

	public static void main(String[] args) {
		System.out.println("try with resource");
		// try-with-resource
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Enter the value for numerator - ");
			int num = sc.nextInt();

			System.out.print("Enter the value for denominator - ");
			int deno = sc.nextInt();

			division(num, deno);

		}
		System.out.println("Program Executed Successfully");
	}

	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the value for numerator - ");
			int num = sc.nextInt();

			System.out.print("Enter the value for denominator - ");
			int deno = sc.nextInt();

			division(num, deno);

		} finally {
			System.out.println("Inside Finally block");
			sc.close();
		}
		System.out.println("Program Executed Successfully");
	}

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the value for numerator - ");
			int num = sc.nextInt();

			System.out.print("Enter the value for denominator - ");
			int deno = sc.nextInt();

			division(num, deno);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally block");
			sc.close();
		}
		System.out.println("Program Executed Successfully");
	}

}
