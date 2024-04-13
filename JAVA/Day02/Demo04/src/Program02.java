
public class Program02 {

	public static void main(String[] args) {
		// Process of converting reference type to value type is called as unBoxing
		Integer i1 = new Integer(100);
		int num = i1.intValue(); // UnBoxing
		System.out.println("Value of i1 - "+i1);
		System.out.println("Value of num - "+num);
		
		int num2 = i1; // Auto unboxing
		System.out.println("Value of num2 - "+num2);
	}

	public static void main1(String[] args) {

		int num1 = 10;

		// process of converting value type to reference type is called as boxing
		Integer i1 = new Integer(num1); // Boxing
		System.out.println("Value in num1 - " + num1);
		System.out.println("Value in i1 - " + i1);

		Integer i2 = num1; // Auto-Boxing
		System.out.println("Value in i2 - " + i2);

	}

}
