package com.sunbeam;

import java.util.Scanner;

public class Point {
	private int xaxis;
	private int yaxis;

	public void acceptPoint()//Point this 
	{
//		this = new Point(); // NOT OK
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter xaxis value - ");
		this.xaxis = sc.nextInt();

		System.out.print("Enter yaxis value - ");
		yaxis = sc.nextInt();
	}

	public void displayPoint() {
		System.out.println("Point (" + xaxis + "," + this.yaxis + ")");
	}

}
