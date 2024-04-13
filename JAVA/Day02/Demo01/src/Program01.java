import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		int empid;
		String name;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		
		System.out.print("Enter the name - ");
//		name = sc.next();
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.print("Enter the Salary - ");
		salary = sc.nextDouble();
		
		System.out.println("Empid - "+empid);
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);

	}

}
