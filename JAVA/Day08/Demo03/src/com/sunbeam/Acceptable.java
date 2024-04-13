package com.sunbeam;

import java.util.Scanner;

// define the interface to keep the method design of acceptData() same
// for all the unrelated classes
// for eg -> 
// employee, shape, Car, Date,Time all these classes can have the same method design
public interface Acceptable {
	public abstract void acceptData(Scanner sc);

}
