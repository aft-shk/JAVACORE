package com.sunbeam;

public class Program02 {
	
	public static void multiply(int n1, int n2) {
		System.out.println("Multiplication = "+(n1*n2));
	}
	
	// Method overloading
	public static void multiply(int n1, int n2,int n3) {
		System.out.println("Multiplication = "+(n1*n2*n3));
	}
	
	public static void square(int num) {
		System.out.println("Sauare - "+(num*num));
	}
	
	// Method overloading
	public static void square(double num) {
		System.out.println("Sauare - "+(num*num));
	}
	
	public static void division(int numerator, double denominator) {
		System.out.println("Division - "+(numerator/denominator));
	}
	
	// Method overloading
	public static void division(double numerator, int denominator) {
		System.out.println("Division - "+(numerator/denominator));
	}
	
	public static void main(String[] args) {
		multiply(10,20);
		multiply(10,20,30);
		
		square(5);
		square(5.7);
		
		division(10,2.5);
		division(10.5,2);

	}

}
