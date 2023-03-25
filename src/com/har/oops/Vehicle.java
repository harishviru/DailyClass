package com.har.oops;

public class Vehicle {
	
	public void start() {
       System.out.println("Vehicle starting");		
	}
	public void stop() {
		System.out.println("Vehicle stoped");
	}
	
	private void m1() {
		System.out.println("Vehicle :m1");
	}
	
	public  void m2() {
		System.out.println("Vehicle :m2");
	}
	
}

class Car extends Vehicle{
	
	public final  void m2() {
		System.out.println("Car :m2");
	}
	
	
	private void m1() {
		System.out.println("Car :m1");
	}
	
	@Override
	public void start() {
		System.out.println("car started");
	}
	
	@Override
	public void stop() {
		System.out.println("car stoped");
	}
	
}
