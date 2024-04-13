package com.sunbeam.entities;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		System.out.println("Date()");
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day - ");
		day = sc.nextInt();
		System.out.print("Enter month - ");
		month = sc.nextInt();
		System.out.print("Enter year - ");
		year = sc.nextInt();
	}
	
	public void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
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
	
	
	
}
