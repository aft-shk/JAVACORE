package com.sunbeam;

interface i1 {

}

interface i2 {

}

interface i3 extends i1, i2 {

}

class c1 {

}

class c2 extends c1 implements i1 {

}

class c3 extends c1 implements i1, i2 {

}

public class Program02 {

	public static void main(String[] args) {
		/*
		 * c2 extends c1 // OK 
		 * c3 extends c1,c2// NOT OK 
		 * c2 implements c1 // NOT OK
		 * 
		 * c2 implements i1 // OK 
		 * c2 implemets i1,i2 // OK 
		 * c2 extends i1 // NOT OK
		 * 
		 * i2 extends i1 // OK 
		 * i2 implements i1 // NOT OK 
		 * i3 extends i1,i2 // OK
		 * 
		 * class c2 extends c1 implements i1 // OK
		 * 
		 * class c3 extends c1 implements i1, i2 // OK
		 */

	}

}
