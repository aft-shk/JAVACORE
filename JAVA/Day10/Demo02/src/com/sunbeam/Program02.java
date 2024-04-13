package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		int n1 = 10;
		int n2 = 5;

		ArithmeticOperations[] arr = ArithmeticOperations.values();
		for (ArithmeticOperations element : arr)
			System.out.println(element.ordinal() + ". " + element.name());

		System.out.print("Enter your choice - ");
		choice = sc.nextInt();

		switch (arr[choice]) {
		case EXIT:
			System.out.println("Thank you...");
			break;

		case ADD:
			System.out.println("Addition - " + (n1 + n2));
			break;

		case SUBSTRACT:
			System.out.println("Substraction - " + (n1 - n2));
			break;

		case MULTIPLICATION:
			System.out.println("Multiplication - " + (n1 * n2));
			break;

		case DIVISION:
			System.out.println("Division - " + (n1 / n2));
			break;
		}
	}

}
