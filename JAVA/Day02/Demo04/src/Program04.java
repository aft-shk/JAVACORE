
public class Program04 {

	public static void main(String[] args) {
		
		if(args.length == 2) {
		System.out.println("args[0] - "+args[0]);
		System.out.println("args[1] - "+args[1]);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.print("Addition - ");
		System.out.println(num1 +num2);
		}
		else
			System.out.println("Invalid no of argument only 2 are allowed");
	}

}
