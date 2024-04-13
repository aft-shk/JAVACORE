package com.sunbeam;

public class Program02 {

	public static void division(int numerator, int denominator) {
		System.out.println("Division - " + (numerator / denominator));
	}

	public static void main(String[] args) {

		try {
			division(10, 2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
//			System.out.println("Denominator cannot be 0");
		}
		System.out.println("Program Executed Successfully");
	}

}
