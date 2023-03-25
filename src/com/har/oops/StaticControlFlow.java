package com.har.oops;

public class StaticControlFlow {

	static int i = 100;

	static {
		m1();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main ......!");
	}

	public static void m1() {
		System.out.println(j);
	}

	static {
		System.out.println("second static block");
	}
	static int j = 200;
}
