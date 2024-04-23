package com.classdemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object of Product
		Product p1; //p1 is a reference
		p1=new Product(1,"LGTV",80000); //p1 is a reference to an object
		
		Product p2=new Product();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Product p3;
		Scanner in=new Scanner(System.in);
		System.out.println("enter product id:");
		int id=in.nextInt();
		System.out.println("Enter the name:");
		String name=in.next();
		System.out.println("Enter the price:");
		double price=in.nextDouble();
		p3=new Product(id,name,price);
		
		System.out.println(p3);
		
		
	}

}
