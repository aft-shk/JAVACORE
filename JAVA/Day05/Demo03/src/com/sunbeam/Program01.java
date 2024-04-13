package com.sunbeam;


public class Program01 {
	
	void add() {
		
	}

	public static void main(String[] args) {
		Test.method2(); // static methods are designed to call on classname
		
		// non static methods cannot be called on classname directly.
		// they are designed to call in objects
		//Test.method1(); // NOT OK
		Test t1 = new Test();
		t1.method1();
		
		t1.method2(); // Not Recommmended
	}
	
	public static void main1(String[] args) {
		Test t1; // reference
		t1 = new Test(); // object
		Test t2 = new Test(30);
		
		t1.displayTest(); // 10,20
		t2.displayTest();// 30,20
		
		//static int num3 = 30;// NOT OK cannot make local variables as static

	}

}
