package p2;

import p1.Test01;

class Derived extends Test01{
	void displayDerived() {
//		System.out.println(num1); // NOT OK - private
//		System.out.println(num2); // NOT OK - default
		System.out.println(num3);//protected 
		System.out.println(num4);// public
	}
}

public class Program {

	public static void main(String[] args) {
		Test01 t = new Test01();
//		System.out.println(t.num1);// NOT OK - priavte
//		System.out.println(t.num2);// NOT OK - default
//		System.out.println(t.num3);// NOT OK- protected
		System.out.println(t.num4);// public
	}

}
