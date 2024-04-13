package com.sunbeam;

import java.util.StringTokenizer;

public class Program09 {

	public static void main(String[] args) {
		String s1 = "Sunbeam Infotech";
		String s2 = "www.sunbeaminfo.com,karad";

		String arr1[] = s1.split(" ");
		for (String string : arr1)
			System.out.println(string);

		StringTokenizer strtok = new StringTokenizer(s2, ".,");
		while (strtok.hasMoreTokens())
			System.out.println(strtok.nextToken());
	}

}
