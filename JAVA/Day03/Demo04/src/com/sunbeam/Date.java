package com.sunbeam;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this(1,1,1900); // constructor chaning
		System.out.println("Parameterless - ");
//		day = 1;
//		month = 1;
//		year = 1900;
	}

	public Date(int day, int month, int year) {
		System.out.println("Parameterized - ");
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println("Date - "+day+"/"+month+"/"+year);
	}
	
}
