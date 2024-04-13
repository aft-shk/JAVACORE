package com.sunbeam;

public class Program02 {
	
	public static void main(String[] args) {
	
		BankAccount []arr; // reference
		arr = new BankAccount[10];
		
//		BankAccount a1 = new BankAccount();
		arr[0] = new BankAccount();
		arr[0].acceptAccountDeatils();
		
		BankAccount a2 = new BankAccount();
		a2.acceptAccountDeatils();
		arr[1] = a2;
		
		arr[0].displayAccountDeatils();
		a2.displayAccountDeatils();
		
		BankAccount.displayAllAccounts(arr);

	}

}
