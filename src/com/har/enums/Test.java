package com.har.enums;

public class Test  extends MyParent{

	 static String name="Har";
	static int  num;
	static int[] arr;
	static Test test;
	
	
	public Test() {
	   super();
	}
	
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(num);
		System.out.println(arr);
		System.out.println(test);
		
		Test t =new  Test() ;
	}
	
}

class MyParent{

	public MyParent() {
	  System.out.println("MyParent.MyParent()");
	}
	
}
