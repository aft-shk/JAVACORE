package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		Time t1 = new Time();
		System.out.println("Initial value of t1 - " + t1);
		t1.setHours(10);
		t1.setMinutes(10);
		try {
			t1.setSeconds(-20);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Final value of t1 - " + t1);
	}

}
