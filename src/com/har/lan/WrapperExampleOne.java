package com.har.lan;

public class WrapperExampleOne {

	public static void main(String[] args) {
		byte b = 10;
		Byte byteVal = new Byte(b);
		System.out.println(byteVal);
		String strVal = "10";

		Byte byteValStr = new Byte(strVal);
		System.out.println(byteValStr);
		System.out.println(byteVal.equals(byteValStr));
       System.out.println("++++++++++++++++++++++++++++++++++");
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("True");
		Boolean b3 = new Boolean("false");
		Boolean b4 = new Boolean("False");
		Boolean b5 = new Boolean("ashok");
		Boolean b6 = new Boolean("TRUE");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
	       System.out.println("++++++++++++++++++++++++++++++++++");

		Boolean b7=new Boolean("yes");
		 Boolean b8=new Boolean("no");
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b7.equals(b8));
		System.out.println(b7==b8);
		

	}

}
