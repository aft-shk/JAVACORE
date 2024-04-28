package com.vehicleuitlity;
import com.vehicle_exception.*;

//import java.util.Date;
import java.util.Scanner;

import com.invalidexceptionclass.InvalidColor;
import com.invalidexceptionclass.InvalidPollutionLevel;
import com.vehicle_exception.Vehicle;
//import com.vehicle_exception.color;

public class VehicleUtility {

	public static  void acceptVehicledetails(Vehicle v[])  throws InvalidColor {
		Scanner in  = new Scanner(System.in);
		for(int i = 0 ; i < v.length;i++) {
			System.out.println("Enter chasisno - ");
			String chasisno = in.next();

			System.out.println("Enter color - 1)white 2)silver 3)black 4)red 5)blue ");
			String c = in.next();
			color colortype = null;
			colortype = VehicleValidation.checkColorType(c);
			System.out.println("Enter price - ");
			double price = in.nextDouble();
			System.out.println("Enter PollutionLevel -");
			double pollutionlevel = in.nextDouble();


			v[i] = new Vehicle(chasisno, colortype, price, pollutionlevel);
		}
		
	}
		
	public static void  displayVehicles(Vehicle v[]) {
		for(int i = 0 ;i < v.length;i++) {
			System.out.println(v[i]);
		}
		
	}
	
	public static void drive(Vehicle v[]) throws InvalidPollutionLevel {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter chasis no -");
		String chasisno = in.next();
		for(int i = 0 ; i < v.length;i++) {
			
			if(chasisno.equals(v[i].getChasisno())) {
				System.out.println("Enter running kilometers of vehicle");
				double d  = in.nextDouble();
				double l = (d/1000);
				System.out.println("Vehicle Pollution Level is - ");
				VehicleValidation.checkPollutionLevel(l);
			}
			else {
				
				
				System.out.println("Invalid chasis no");
			}
		}
		
	}
		



	


}
