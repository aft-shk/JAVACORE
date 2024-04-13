package com.sunbeam;

import java.util.Scanner;

public class BankAccount {
	private final int accno;// = ++generate_accno; OR
	private String name;
	private double balance;
	private static int generate_accno;//=1000; // field initializer OR
	
	// static block
	static{
		generate_accno = 1000;
	}
	
	// object Initializer
	{
		accno = ++generate_accno;
	}
	
	void acceptAccountDeatils() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name - ");
		name = sc.next();
		System.out.println("Enter initial balance - ");
		balance = sc.nextDouble();
	}
	
	void displayAccountDeatils() {
		System.out.println("Accno - "+accno);
		System.out.println("Name - "+name);
		System.out.println("Balance - "+balance);
	}
	
	static void displayAllAccounts(BankAccount[] arr) {
		// to-do
		// write logic to display all created accounts
	}
}

