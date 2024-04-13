package com.sunbeam.p2;

// type safety -> Generics
class Box<T> {

	T obj; // reference

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program {

	public static void main(String[] args) {
		Box b1 = new Box(); // Waring -> Raw type -> Object
		b1.setObj("sunbeam");
		b1.setObj(10);
		String s1 = (String) b1.getObj(); // class cast exception

		Box<Integer> b2 = new Box();
		b2.setObj(10);
		// b2.setObj("sunbeam"); /// compiler error
		Integer i1 = b2.getObj();

		Box<Double> b3 = new Box<>();
		b3.setObj(10.25);
		// b3.setObj("sunbeam");// compiler error
		Double d1 = b3.getObj();
	}

	public static void main1(String[] args) {
		// creating object of the generic class Box
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(10);
		Integer i1 = b1.getObj();
		System.out.println("i1 -" + i1);

		Box<String> b2 = new Box<String>();
		b2.setObj("Sunbeam");
		String s1 = b2.getObj();
		System.out.println("s1 - " + s1);

		Box<Double> b3 = new Box<Double>();
		// b3.setObj("12.35");// Compiler Error
		b3.setObj(12.35);
		Double d1 = b3.getObj();
		System.out.println("d1 - " + d1);
	}

}
