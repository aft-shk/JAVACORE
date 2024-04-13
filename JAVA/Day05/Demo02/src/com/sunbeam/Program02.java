package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		final int num1;
		num1 = 10;
		
		//num1 = 20; // NOT OK
		System.out.println("num1 = "+num1);
		
		final Test t1; // reference is final
		t1 = new Test();
		
//		t1 = new Test(); // NOT OK
		Test t2 = new Test();
//		t1=t2;// NOT OK
		
	}

}
