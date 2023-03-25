package com.har.oops;

public class InStaticControlFlow {

	 int i = 100;

	 static{
		 System.out.println("static block");
	 }
	 
	 {
		m1();
		System.out.println("first instance block");
	}
	 
	 public InStaticControlFlow() {
		System.out.println("InStaticControlFlow. 0-param constructor");
	}

	public static void main(String[] args) {
		InStaticControlFlow ic=new InStaticControlFlow();
		InStaticControlFlow ic2=new InStaticControlFlow();
		InStaticControlFlow ic3=new InStaticControlFlow();

		System.out.println("main ......!");
	}

	public  void m1() {
		System.out.println(j);
	}

	 {
		System.out.println("second instance block");
	}
	 int j = 200;
}
