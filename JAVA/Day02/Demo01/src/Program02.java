import java.io.Console;

// This demo will work only if executed through terminal
// In STS it will given NULLPointerException

public class Program02 {

	public static void main(String[] args) {
		String email;
		char password[];
		
		Console console = System.console();
		System.out.print("Enter the email - ");
		email = console.readLine();
		System.out.print("Enter the password - ");
		password = console.readPassword();
		
		System.out.println("Email - "+email);
		System.out.println("Password - "+password);
		
		
		
	}

}
