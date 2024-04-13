package com.sunbeam.p3;

interface Shape {

}

class Circle implements Shape {

}

class Rectangle implements Shape {

}

//class Box2<T implements Shape> // implements is not allowed in bounded type
class Box2<T extends Shape> {

}

// Bounded type parameter
class Box<T extends Number> {

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
		Box<Integer> b1 = new Box<>();// Integer extends Number

		Box<Double> b2 = new Box<>(); // Double extends Number

		Box<Number> b3 = new Box<>(); // Number

		// Box<String> b4 = new Box<>(); // ???

		// Box<Object> b5 = new Box<>(); //

		// Box b6 = new Box(); // Raw type -> will be considerd as Number

	}
}
