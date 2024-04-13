package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program03 {

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

		} catch (ArithmeticException | InputMismatchException e)// multi-catch block
		{
			e.printStackTrace();
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
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("Program Executed Successfully");
	}

}
