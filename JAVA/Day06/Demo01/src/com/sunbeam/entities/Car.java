package com.sunbeam.entities;

import java.util.Scanner;

public class Car {
	private String carName;
	private String carNumber;
	
	public Car() {
		System.out.println("Car()");
	}

	public Car(String carName, String carNumber) {
		this.carName = carName;
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void acceptCar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter car name - ");
		carName = sc.next();
		System.out.print("Enter car number - ");
		carNumber = sc.next();
	}
	
	public void displayCar() {
		System.out.println("Car Name - "+carName);
		System.out.println("Car Number - "+carNumber);
	}
	
	
}
