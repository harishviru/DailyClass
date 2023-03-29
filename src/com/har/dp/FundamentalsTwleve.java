package com.har.dp;

public class FundamentalsTwleve {

	
	
	
	public static void main(String... args) {
	
		//m1(10);   //v1
		//m1(10,20);  //v2
		//m1(10,20,50);
		
		m2();
		m2(10);
		m2(30,60);
		m2(30,20,60);
		byte[] bArray =new byte[2];
		bArray[0]=90;
		bArray[1]=30;
		
		m3(bArray);
		
		m4(10);
		m4(30,30,40);
	}
	
	//v1,2
	public static void m1(int a,int b,int c) {
		System.out.println(a +" "+b +" "+c);
	}
	public static void m2(int...q) {
		System.out.println("var-arg method");
	}
	public static void m3(byte[] b) {
		System.out.println("byte array");
	}
	public static void m4(int k,int...q) {
		System.out.println("int k   +    var-arg method");
	}
	
	
	
	
}




