package com.har.scan;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		//scannerInput();

		int[]   arr = {10,30,90,78,91};
		
		for(int i=0;i<arr.length;i++) {
			  int a=     arr[i];
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
	}

	private static void scannerInput() {
		Scanner scn =new Scanner(System.in);
		int a;
		int b;
		int sum;
		System.out.println("*********Please provide a and b values here ******");
		System.out.println("Please Enter a value  ");
		    a      =scn.nextInt();
		System.out.println("you provided value for a Is :"+a);    
		
		System.out.println("***");
		System.out.println("Please Enter b value  ");
	    b      =scn.nextInt();
	  System.out.println("you provided value for b Is :"+b);    
	  sum = a+b;
	  System.out.println("Final Sum value is "+sum);
	}
	
	
}
