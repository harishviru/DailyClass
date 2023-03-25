package com.har.in;

public class Outer {

	static int x=10;
	
	 static class Nested{
		public Nested() {
			  System.out.println("Outer.Nested.Nested()");
		}
		
		public    void test() {
			System.out.println("Outer.Nested.test()");
		}
	}
	
	
	public static void main(String[] args) {
		Outer.Nested  r = new Outer.Nested();
		r.test();
		System.out.println(Outer.x);
		
		
	}
	
	
}
