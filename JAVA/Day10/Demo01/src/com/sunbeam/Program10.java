package com.sunbeam;

public class Program10 {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("sunbeam");
		StringBuilder s2 = new StringBuilder("sunbeam");
		StringBuilder s3 = s1.append("Infotech");

		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);

		System.out.println("s1==s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));
	}

	public static void main1(String[] args) {
		StringBuffer s1 = new StringBuffer("sunbeam");
		StringBuffer s2 = new StringBuffer("sunbeam");

		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);

		System.out.println("s1==s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));
	}

}
