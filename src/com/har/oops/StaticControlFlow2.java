package com.har.oops;

public class StaticControlFlow2 {

	static {
		System.out.println(StaticControlFlow2.i);
	}

	static int i=200;

	public static void main(String[] args) {
		System.out.println(i);
	}
	
}
