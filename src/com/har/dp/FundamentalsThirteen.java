package com.har.dp;

public class FundamentalsThirteen {

	public static void methodOne(int i) {
		System.out.println("general method");
	}
	

	public static void methodOne(int... i) {
		System.out.println("var-arg method");
	}


	public static void main(String... args) {
		methodOne();//
		methodOne(10, 20);// 
		methodOne(10);// 
		int[] arr =new int[1];
		arr[0]=90;
		methodOne(arr);
		
	}
}
