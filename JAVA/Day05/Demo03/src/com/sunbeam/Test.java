package com.sunbeam;

public class Test {
	int num1;	
	static int num2;//= 20; // field Initializer

	// static initializer block
	// it is an initializer block used to initialize the static fields
	// it gets executed only once at the time of class loading
	static{
		System.out.println("Static initializer block");
		num2 = 20;
		// num1=100; // NOT OK
	}
	
	// object initializer block
	{
		System.out.println("Object initializer block");
		num1=10;
		//++num2;
	}
	
	public Test() {
		System.out.println("Parameterless Ctor");
	}
	
	Test(int num1){
		System.out.println("Parameterized Ctor");
		this.num1 = num1;
	}
	
	// non static methods
	void method1() {
		System.out.println("non static method-1()");
	}
	
	// static methods do not get this reference
	static void method2() {
		System.out.println("static method-2()");	
		//System.out.println(num1); //NOT OK non static fields are not accessiable
		System.out.println(num2); // static fields are accessiable
	}
	
	void displayTest() {
		// static int num3 = 30; // NOT OK cannot make local variables as static
		System.out.println("num1 - "+num1);
		System.out.println("num2 - "+num2);
	}
}
