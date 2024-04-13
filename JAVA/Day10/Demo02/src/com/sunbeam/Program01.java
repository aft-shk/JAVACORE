package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		int n1 = 10;
		int n2 = 5;

		System.out.println("0. EXIT");
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter your choice - ");
		choice = sc.nextInt();

		switch (choice) {
		case 0:
			System.out.println("Thank you...");
			break;

		case 1:
			System.out.println("Addition - " + (n1 + n2));
			break;

		case 2:
			System.out.println("Substraction - " + (n1 - n2));
			break;

		case 3:
			System.out.println("Multiplication - " + (n1 * n2));
			break;

		case 4:
			System.out.println("Division - " + (n1 / n2));
			break;
		}
	}

}
