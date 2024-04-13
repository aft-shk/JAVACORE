package com.sunbeam;

class Super // Base/Parent
{
	public int num1;
	public int num2;
	
	//Object Initializer
	{
		System.out.println("Super Object Initializer");
	}
	
	public Super() {
	System.out.println("Ctor of Super()");
	}
	
	public void displayBase() {
		System.out.println(this.num1);
		System.out.println(this.num2);
	}
}

// inheritance
class Sub extends Super // Derived/Child
{
	public int num3;
	
		// Object Initializer
		{
			System.out.println("Sub Object Initializer");
		}
	
	public Sub() {
		System.out.println("Ctor of Sub()");	
	}
	
	public void displaySub() {
		System.out.println(this.num1);
		System.out.println(this.num2);
		System.out.println(this.num3);
	}

}

public class Program01 {
	
	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.acceptEmployee();
//		e.displayEmployee();
		
		Employee e = new Employee("rohan",1,10000);
		e.displayEmployee();
	}

	public static void main2(String[] args) {
//		Person p = new Person(); // Person Parameterless
//		p.acceptPerson();
//		p.displayPerson();
		
		Person p = new Person("rohan"); // Person Parameterized
		p.displayPerson();
	}

	public static void main1(String[] args) {
//		Super sup1 = new Super();
		//Sub sub1 = new Sub();
	}

}
