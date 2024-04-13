package com.sunbeam;

public class Program07 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = new String("sunbeam");
		String s3 = s1; // Reference copy

		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);
		System.out.println("s3 - " + s3);

		System.out.println("s1==s2 - " + (s1 == s2));
		System.out.println("s1==s3 - " + (s1 == s3));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));

	}

}
