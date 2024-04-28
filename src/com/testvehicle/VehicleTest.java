package com.testvehicle;

//import java.util.Date;
import java.util.Scanner;

//import com.invalidexceptionclass.InvalidColor;
import com.vehicle_exception.Vehicle;
//import com.vehicle_exception.color;
import com.vehicleuitlity.VehicleUtility;

public class VehicleTest {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)  {
		try {
			System.out.println("Enter no of Vehicles -");
			int size = in.nextInt();
			Vehicle v1[] = new Vehicle[size];

			while(true) {
				System.out.println("*******Menu*********");
				System.out.println("1.Add new Vehicle");
				System.out.println("2.Drive");
				System.out.println("3.Display vehicle");
				System.out.println("Enter the choice : -");
				int choice = in.nextInt();
				switch(choice) {

				case 1 :
					VehicleUtility.acceptVehicledetails(v1);
					break;
				case 2 :
					VehicleUtility.drive(v1);
					break;
				case 3 :
					VehicleUtility.displayVehicles(v1);
					break;
				default:
					break;
				}
			}
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
}

}
