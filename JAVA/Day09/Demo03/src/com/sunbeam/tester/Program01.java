package com.sunbeam.tester;

import com.sunbeam.entity.Date;

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		try {
			d1.setDay(10);
			d1.setMonth(17);
			d1.setYear(1800);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program executed successfullly");
	}

}
