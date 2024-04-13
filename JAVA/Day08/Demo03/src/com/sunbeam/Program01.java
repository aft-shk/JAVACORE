package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		shape = new Circle();
		// shape = new Rectangle();

		shape.acceptData(sc);
		shape.calculateArea();
		shape.displayArea();

		sc.close();
	}

}
