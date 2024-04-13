package com.sunbeam;

import java.time.LocalDate;

public class Program03 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getYear());
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getMonthValue());

		LocalDate d2 = LocalDate.of(2023, 11, 21);
		System.out.println(d2);
	}

}
