package com.sunbeam;

import java.io.Serializable;

interface Printable {
	void display();
}

interface Displayable {
	void display();
}

class Employee implements Displayable, Printable {
	@Override
	public void display() {
		// TODO Auto-generated method stub
	}
}

// Empty interface
// empty interfaces are called as marker interface
interface Marker {

}

public class Program02 implements Serializable, Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
