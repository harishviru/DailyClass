package com.har.dp;

public class Fundamentals {

	// variable syntax :
	// A.M D.T variable_Name = <Value/Expression/Object>;
	int x = 10; // default int x =10; // non-static
	public int y = 20; // public int y=20; //non-static
	protected static short s = 90; // static

	long lv = 10l;

	float f = 90.0f;

	double d = 90.0;

	char ch = 'a';

	boolean b = false;

	public static void main(String[] args) { // static -area

		int z = 190;

		System.out.println(s);
		// System.out.println(x); we are not able to access non-static varaible in
		// static area directly

		// A.M D.T v.n/ref = value/exp/obj;
		Fundamentals f = new Fundamentals();

		System.out.println(f.x);
		System.out.println(f.b);

		System.out.println(f.lv);
		
		System.out.println("---------------------------");
		f.m1();

	}// main

	public void m1() { // non-static
		System.out.println(s);
		System.out.println(d);

	}

}
