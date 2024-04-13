package com.sunbeam;

import java.util.Date;

public class Program02 {

	public static void main(String[] args) {
		Time t1 = new Time(11, 20);
		Time t2 = new Time(11, 20);

		Date d = new Date();

		System.out.println("t1 = " + t1); // 11:20
		System.out.println("t2 = " + t2); // 11:20

		if (t2.equals(t1))
			System.out.println("Both objects are equal");
		else
			System.out.println("Both objects are not equal");

	}

}
