package com.sunbeam;

class Singleton{
	// step-2
	private static Singleton ref = null;
	
	//step-3
	//static {
	//	ref = new Singleton();
	//}
	
	// step-1
	private Singleton() {
		System.out.println("Parameterless ctor");
	}
	
	// step-4
	static Singleton getInstance(){
		// insted of step 3 do it inside the getInstance method
		if(ref==null)
			ref = new Singleton();
		return ref;
	}
}

public class Program04 {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();
		
	}

}
