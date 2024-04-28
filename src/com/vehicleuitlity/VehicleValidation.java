package com.vehicleuitlity;
import com.vehicle_exception.color;
import com.invalidexceptionclass.InvalidColor;
import com.invalidexceptionclass.InvalidPollutionLevel;

//import com.invalidexceptionclass.InvalidPollutionLevel;

public class VehicleValidation {
	public static final int MAX_LEVEL ;
	
	static {	
		MAX_LEVEL = 20;
	}
	
	public static void checkPollutionLevel(double level) throws  InvalidPollutionLevel
	{
		if(level > MAX_LEVEL) {
			throw new InvalidPollutionLevel("Pollution level is high");
		}
	}
	
	public static final color checkColorType(String a) throws InvalidColor{
		color col = null;
		switch(a) {
		case "white" :
			col = color.white;
			break;
		case "silver" :
			col = color.silver;
			break;
		case "black" :
			col = color.black;
			break;
		case "red" :
			col = color.red;
			break;
		case "blue" :
			col = color.blue;
			break;
		default:
			throw new InvalidColor("Invalid Color");
		
		}
		
		return col;
		
		
	}

}
