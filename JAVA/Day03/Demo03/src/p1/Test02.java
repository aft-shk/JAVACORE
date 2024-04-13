package p1;

class Derived2 extends Test01{
	void displayDerived2() {
//		System.out.println(num1); // NOT OK - private
		System.out.println(num2);// - default
		System.out.println(num3); // - protected
		System.out.println(num4);// - public
	}
}

public class Test02 {
	
	void displayTest02() {
		Test01 t = new Test01();
		//System.out.println(t.num1); // NOT OK
		System.out.println(t.num2);
		System.out.println(t.num3);
		System.out.println(t.num4);
	}
}
