package com.sunbeam;

class Over{
	public static void main(String[] args){
		Under u = new Under(); u.test();
		}
	
		int test(){
			System.out.println("over");return 1;
		}
	}
class Under extends Over{
	short test(){
		super.test();
		System.out.println("Under");return 1;
		}
	}

public class Program01 {
	public  void  add(int ...arr) {
		
	}
	public static void main(String[] args) {
//		Person p = new Person();
//		p.accept();
//		p.display();
		
//		Employee e = new Employee();
//		e.accept();
//		e.display();
		Manager m = new Manager();
		m.accept();
		m.display();
	}

}
