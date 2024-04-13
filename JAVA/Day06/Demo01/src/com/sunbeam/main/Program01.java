package com.sunbeam.main;

import com.sunbeam.entities.Car;
import com.sunbeam.entities.Employee;

public class Program01 {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.acceptEmployee();
//		e1.displayEmployee();
		
		Employee e2 = new Employee();
		e2.acceptEmployee();
		Car c1 = new Car();
		c1.acceptCar();
		e2.setCar(c1);
		e2.displayEmployee();
	}

}
