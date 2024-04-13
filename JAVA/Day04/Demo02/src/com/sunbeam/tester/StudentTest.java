package com.sunbeam.tester;

import com.sunbeam.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student[] arr; // reference
		arr = new Student[5];
		
		arr[0] = new Student();
		arr[1] = new Student(1,"s2",60);
		arr[2] = new Student();
		arr[3] = new Student(2,"s4",70);
		arr[4] = new Student();
		
		// comment lines 11 to line 15 and then
		// input the student details from user and add in the above array
		// use a for loop and foreach for the same and notice the difference
		
//		for(int i=0;i<arr.length;i++)
//			arr[i].display();
		
		for(Student sref: arr)
			sref.display();

	}

}
