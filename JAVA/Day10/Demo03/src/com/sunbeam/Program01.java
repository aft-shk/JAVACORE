package com.sunbeam;

// Cloneable is a marker interface
// It is used to provide the information to the JVM that it will be cloning itself
class Time implements Cloneable {
	int hrs;
	int mins;

	public Time() {
	}

	public Time(int hrs, int mins) {
		this.hrs = hrs;
		this.mins = mins;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Object class clone method does shallow copy
		return super.clone();
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", mins=" + mins + "]";
	}

}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time(12, 26);
		Time t2 = null;
		try {
			t2 = (Time) t1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("t1 - " + t1);
		System.out.println("t2 - " + t2);

		System.out.println("After change in t2");
		t2.setMins(32);
		t2.setHrs(11);
		System.out.println("t1 - " + t1);
		System.out.println("t2 - " + t2);

	}

	public static void main1(String[] args) {
		Time t1 = new Time(12, 26);
		Time t2 = t1;
		System.out.println("t1 - " + t1);
		System.out.println("t2 - " + t2);

		System.out.println("After change in t2");
		t2.setMins(32);
		t2.setHrs(11);
		System.out.println("t1 - " + t1);
		System.out.println("t2 - " + t2);

	}

}
