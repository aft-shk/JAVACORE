
public class Program01 {

	public static void main(String[] args) {

		boolean status = false; //(boolean literal)
		System.out.println("Value inside status - " + status);

		System.out.println("-----------------------------");

		char ch = 'A'; //(character literal)
		System.out.println("Size of char - " + Character.BYTES);
		System.out.println("Min value of char - " + (int)Character.MIN_VALUE);
		System.out.println("Max value of char - " + (int)Character.MAX_VALUE);
		System.out.println("Value inside ch - " + ch);

		System.out.println("-----------------------------");

		byte num1 = 10;// (Intergal Literals)
		System.out.println("Size of byte - " + Byte.BYTES);
		System.out.println("Min value of byte - " + Byte.MIN_VALUE);
		System.out.println("Max value of byte - " + Byte.MAX_VALUE);
		System.out.println("Value inside byte - " + num1);

		System.out.println("-----------------------------");

		short num2 = 100; // (Intergal Literals)
		System.out.println("Size of short - " + Short.BYTES);
		System.out.println("Min value of short - " + Short.MIN_VALUE);
		System.out.println("Max value of short - " + Short.MAX_VALUE);
		System.out.println("Value inside short - " + num2);
		
		System.out.println("-----------------------------");

		int num3 = 1000; // (Intergal Literals)
		System.out.println("Size of int - " + Integer.BYTES);
		System.out.println("Min value of int - " + Integer.MIN_VALUE);
		System.out.println("Max value of int - " + Integer.MAX_VALUE);
		System.out.println("Value inside int - " + num3);
		
		System.out.println("-----------------------------");

		long num4 = 10000; // (Intergal Literals)
		System.out.println("Size of long - " + Long.BYTES);
		System.out.println("Min value of long - " + Long.MIN_VALUE);
		System.out.println("Max value of long - " + Long.MAX_VALUE);
		System.out.println("Value inside long - " + num4);
		
		System.out.println("-----------------------------");

		float num5 = 123.456f; //(floating-point Literals)
		System.out.println("Size of float - " + Float.BYTES);
		System.out.println("Min value of float - " + Float.MIN_VALUE);
		System.out.println("Max value of float - " + Float.MAX_VALUE);
		System.out.println("Value inside float - " + num5);
		
		System.out.println("-----------------------------");

		double num6 = 123.456; //(floating-point Literals)
		System.out.println("Size of double - " + Double.BYTES);
		System.out.println("Min value of double - " + Double.MIN_VALUE);
		System.out.println("Max value of double - " + Double.MAX_VALUE);
		System.out.println("Value inside double - " + num6);
	}

}
