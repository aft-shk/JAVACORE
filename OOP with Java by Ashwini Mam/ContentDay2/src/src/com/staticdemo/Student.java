package com.staticdemo;

public class Student {
	
	//non static data member
	private int id;
	private String name;
	private float marks;
	
	//static counter to keep track of number of objects
	private static int counter=0;
	
	public Student(String name,float marks)
	{
		//increment the counter as soon as the object is created
		counter++;
		this.id=counter+99;  //every object will be assigned an auto generated id
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id-"+id+" Name-"+name+" Marks-"+marks;
	}

	//static method to get the number of students
	public static int getCounter()
	{
		return counter;
	}
}
