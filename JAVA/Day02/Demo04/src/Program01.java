
public class Program01 {
	
	public static void main(String[] args) {
		float n1 = 123.456f;
		double n2 = n1; // widening
		
		double n3 = 345.678;
		float n4 = (float)n3; // narrowing
		
		long n5 = (long)n1; // narrowing
		
		long n6=986547;
		float n7 = n6; // widening
		
	}

	public static void main3(String[] args) {
		boolean status = true;
		// conversion of boolean to any other type is not allowed
		//int num = (int)status; // NOT OK
		
		char ch1 = 'a';
		byte b1 = (byte)ch1; // type conversion
		int n1 = ch1; // widening
		
		int n2 = 10000;
		char ch2 = (char)n2;
		byte b2 = 50;
		ch2 = (char)b2; // type conversion
		
	}

	public static void main2(String[] args) {
		byte num1 = 10;
		short num2 = num1; // widening
		int num3 = num2; // widening
		long num4 = num3; // widening

		long num5 = 10000;
		int num6 = (int) num5; // narrowing
		short num7 = (short) num6; // narrowing
		byte num8 = (byte) num7; // narrowing
	}

	public static void main1(String[] args) {
		// process of converting narrower type of data
		// into wider type is called as widening
		int num1 = 10;
		double num2 = num1; // widening

		// process of converting wider type of data
		// into narrower type is called as narrowing
		// at the time of narrowing explicit type casting is mandatory
		double num3 = 12.34;
		int num4 = (int) num3; // narrowing
	}
	 

}
