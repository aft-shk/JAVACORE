 
class Test{
	public void f1() {
		System.out.println("Test::f1()");
	}
}

class Program02 {
	public static void main(String[] args) {
	System.out.println("Hello from Program02");
	Test t1 = new Test();
	t1.f1();
	}

}

