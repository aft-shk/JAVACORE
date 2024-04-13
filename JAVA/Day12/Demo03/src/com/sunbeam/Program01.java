package com.sunbeam;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Program01 {

	public static void main(String[] args) {
//		Collection<Integer> c1 = new ArrayList<>();
		Collection<Integer> c1 = new LinkedList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		System.out.println("using for-each");
		for (Integer element : c1)
			System.out.println(element);

		Integer obj = 80;
		System.out.println("Is element present - " + c1.contains(obj));

		System.out.println("No of elements - " + c1.size());

		Integer obj2 = 40;
		c1.remove(obj2);

		System.out.println("using iterator ->");
		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			System.out.println("Element - " + itr.next());
		}

	}

}
