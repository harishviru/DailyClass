package com.har.dp;

public class FundamentalsFour {

	public static void main(String[] args) {

		FundamentalsFour fFour = new FundamentalsFour();
		fFour.m1();
		m2();
		fFour.m2();

		System.out.println("+++++++++++++++++++++++++++=");

		int result = fFour.sum(20, 30);
		System.out.println(result);

		int mResult = mul(10, 30); // fFour.mul(10,30);
		System.out.println(mResult);

		System.out.println("+++++++++++++++++++++++++++=");

		fFour.wish("sai");

		sayHello("pavan"); // fFour.sayHello("pavan");

		System.out.println("+++++++++++++++++++++++++++=");

		String sRes = fFour.sayGoodBye();

		System.out.println(sRes);

		String sresultVal = sayGoodByeAgain();

		System.out.println(sresultVal);

	}

	// methods : non-static ,static ,abstract

	// #01 . no-input -no-output (non-static)
	public void m1() {
		System.out.println("m1() method..............!");

	}

	// #02. no-input -no-output (static)
	public static void m2() {
		System.out.println("m2() method..............!");

	}

	// #03. input -output (non-static)
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	// #04. input -output (static)
	public static int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	// #05. input -no-output (no-static)
	public void wish(String name) {
		System.out.println("     hello  " + name);
	}

	// #06. input -no-output (static)
	public static void sayHello(String name) {
		System.out.println("     sayHello    " + name);
	}

	// #07. no- input output (no-static)
	public String sayGoodBye() {
		String str = "Good bye ..................!";
		return str;
	}

	// #08. no- input output (static)
	public static String sayGoodByeAgain() {
		String str = "Good bye ......again....!";
		return str;
	}

}
