package com.sunbeam;

import java.util.Calendar;

public class Program02 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);

		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));

	}

}
