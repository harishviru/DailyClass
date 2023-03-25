package com.har.dp;

public class FundamentalsTwo {

	// non-static
	int x = 10; // decalratio+inilization

	int z; // decalration
	// z =90; value assignment

	float f;

	char c;

	boolean b;

	String    str;
	
	FundamentalsTwo   ftwo;                //   
	
	
	// static
	static int as = 10;

	static int bi;

	static float fs;

	static char cs;

	static boolean bs;
	
	static 	String    strs;
	
	static  FundamentalsTwo   ftwos;


	public static void main(String[] args) {

		FundamentalsTwo ft = new FundamentalsTwo();

		System.out.println("***********class level non-static variables****************");

		System.out.println(ft.x);
		System.out.println(ft.z);
		System.out.println(ft.f);
		System.out.println(ft.c);
		System.out.println(ft.b);
		System.out.println(ft.str);
		System.out.println(ft.ftwos);


		System.out.println("***********class level static variables****************");

		System.out.println(as);
		System.out.println(bi);
		System.out.println(fs);
		System.out.println(cs);
		System.out.println(bs);
		System.out.println(strs);
		System.out.println(ftwos);


	}

}
