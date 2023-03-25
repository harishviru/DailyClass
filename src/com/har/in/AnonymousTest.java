package com.har.in;

public class AnonymousTest {

	
	
	
	public static void main(String[] args) {
		
		
		Vehicle v =new Vehicle() {
			public void start() {
				System.out.println("buzzzzzz");
			}
		};
		v.start();
		
		
	}
	
}
