package com.har.in;

public class Car {
	
	 class Engine{     // Inner -start
		 //Inner class -Instance area
		 public void start() {
			 System.out.println("Car.Engine.start()");
		 }
	 }// Inner -End
	
	 //#01 car --> method(Outer - Instance area)
	 private void createEngine() {
		 System.out.println("Car.createEngine()");
		 Engine e =new Engine();
		 e.start();
	 }
	 
	 //#02 .car --> method(Outer - static area)
	 public static void startEngine() {
		 System.out.println("Car.startEngine()");
		 Car c=new Car();
		 Car.Engine e =c.new Engine();
		 e.start();
	 }
	 
	 
	 
	public static void main(String[] args) {
		Car c =new Car();  //Outer
		  c.createEngine();
		
		  System.out.println("__________________--");
		  Car.startEngine();
	}

}
