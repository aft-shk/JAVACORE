package com.sunbeam.p1;

class Box {
	private Object obj;

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
}

public class Program {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObj(10);
		Integer i1 = (Integer) b1.getObj();
		System.out.println("i1 - " + i1);

		Box b2 = new Box();
		b2.setObj(new String("sunbeam"));
		String s1 = (String) b2.getObj();
		System.out.println("s1 - " + s1);

		Box b3 = new Box();
		b3.setObj("12.34");
		Double d1 = (Double) b3.getObj(); // Class Cast Exception
		System.out.println("d1 - " + d1);

	}

}
