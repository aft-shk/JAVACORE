
class Program01 {
	public static void main(String[] args) {
		System.out.println("Hello from Program01");
		main();
		
		// inside static function we cannot call non static functions
		// main(10); // NOT OK
	}
	
	// not allowed
	public static void main() {
		System.out.println("main()");
	}
	
	public void main(int n1) {
		System.out.println("main(int)->"+n1);
	}
	
	// error -> Main method is not static
//	public void main(String args[]) {
//		System.out.println("main()");
//	}
	
	//Main method must return a value of type void
//	public static int main(String args[]) {
//	System.out.println("main()");
//	return 1;
//}
	
	//Main method not found
//	 static void main(String args[]) {
//		System.out.println("main()");
//	}
	
}

//class Program02{
//	public static void main(String[] args) {
//		System.out.println("Hello from Program02");
//	}
//}
