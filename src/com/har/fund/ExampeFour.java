package com.har.fund;

public class ExampeFour {

	
	//Instance /non-static variables
	int a;                   
	int[] b;
	
	//static variables or class level variables
	static int c;
	static int[] d;
	
	
	public static void main(String... abs) {
		ExampeFour ef  =new ExampeFour() ;
		
		System.out.println(ef.a);
		System.out.println(ef.b);
		
		
		System.out.println(c);
		System.out.println(d);

		int e = 10;                   
		int[] f = new int[4];
		
		System.out.println(e);
		System.out.println(f[0]);
		
	}
	
	public static void main(int... abs) {
		System.out.println("ExampeFour. abs int args");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
