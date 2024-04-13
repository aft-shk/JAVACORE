package com.sunbeam;

public class Program06 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = new String("sunbeam").intern();
		// intern() is used to convert string objects into string literals

		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);

		System.out.println("s1==s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));

	}

}
