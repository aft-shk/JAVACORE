package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person arr[] = new Person[5];
		int index = 0;
		Person p;
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Employee");
			System.out.println("2. Add Student");
			System.out.println("3. Display All Employees");
			System.out.println("4. Display All Students");
			System.out.println("5. Display All");
			System.out.print("Enter choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you...");
				break;
			case 1:
				if (index < 5) {
					p = new Employee();
					p.acceptData(sc);
					p.displayData();
					arr[index] = p;
					index++;
				} else
					System.out.println("No Vacancies...");
				break;
			case 2:
				if (index < 5) {
					p = new Student();
					p.acceptData(sc);
					arr[index] = p;
					index++;
				} else
					System.out.println("No seats...");
				break;
			case 3:
				for (int i = 0; i < index; i++)
					if (arr[i] instanceof Employee) {
						Employee e = (Employee) arr[i]; // Downcasting
						e.displayData();
						e.salaryAfterTax();
					}
				break;

			case 4:
				for (int i = 0; i < index; i++)
					if (arr[i] instanceof Student) {
						Student s = (Student) arr[i]; // Downcasting
						s.displayData();
						s.calulatePercent();
					}
				break;

			case 5:
				// to-do
				break;
			default:
				System.out.println("Wrong Choice..");
				break;
			}
		} while (choice != 0);
	}

}
