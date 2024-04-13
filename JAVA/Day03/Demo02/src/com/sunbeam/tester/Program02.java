package com.sunbeam.tester;

//import com.sunbeam.shapes.dim2.Circle;
//import com.sunbeam.shapes.dim2.Rectangle;

import com.sunbeam.shapes.dim3.Box;
import com.sunbeam.shapes.dim2.*;

public class Program02 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.calculateArea(7);
		
		Rectangle r1 = new Rectangle();
		r1.calculateArea(10, 5);
		
		Box b1 = new Box();
		b1.calculateArea(10, 5, 2);

	}

}
