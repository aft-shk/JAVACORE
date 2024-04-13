package com.sunbeam.tester;

import com.sunbeam.entity.Time;
import com.sunbeam.exceptions.InvalidTimeException;

public class Program02 {

	public static void main(String[] args) {
		Time t1 = new Time();
		try {
			t1.setHours(12);
			t1.setMinutes(40);
			t1.setSeconds(120);
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}

		System.out.println("Program executed successfullly");
	}

}
