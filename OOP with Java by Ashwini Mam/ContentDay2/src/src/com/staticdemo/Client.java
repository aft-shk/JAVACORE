package com.staticdemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Max",78);
		Student s2=new Student("John", 90);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("there are total "+ Student.getCounter() +" students");
	}

}
