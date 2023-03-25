package com.har.oops;

public class OverridingExample {

	public static void main(String[] args) {
		
		//#01 
		Vehicle v =new Vehicle();
		v.start();
		v.stop();
		
		//#02 
		Car c =new Car();
		c.start();
		c.stop();
		
		
		//#03
		Vehicle vOne =new Car();
		vOne.start();
		vOne.stop();
		
		//#04
		//Car cOne =new Vehicle();
		
		
		
	}
}
