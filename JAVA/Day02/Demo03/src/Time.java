import java.util.Scanner;

class Time {
	// fields
	private int hrs;
	private int mins;

	// method
	public void acceptTime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hrs - ");
		hrs = sc.nextInt();
		System.out.print("Enter the mins - ");
		mins = sc.nextInt();
	}
	


	public void displayTime() {
		System.out.print("Time - "+hrs + " : "+mins);
	}
}
