package com.sunbeam;

import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
//		Time t1 = new Time();
//		System.out.println(t1);

		Time[] arr = new Time[3];
		arr[0] = new Time();
		arr[1] = new Time(11, 20);
		arr[2] = new Time(12, 30);

		System.out.println(Arrays.toString(arr));

	}

}
