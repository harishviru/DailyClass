package com.har.in;

public class Person {

	int heartBeatRate =72;
	
	//define a instance method
	 public  void m1() {
		 
		    int   soundRate =102;
		    
		    
		    
		          class Heart{
		        	 public void beatSound() {
		        		 System.out.println("   beat is running with :-->"+heartBeatRate +"speed ->" +soundRate);
		        	 }
		         }
		         
		         Heart h =new Heart();
		         h.beatSound();
		         
	 }
	
	public static void main(String[] args) {
		
		Person p =new Person();
		p.m1();
		
	}
	
	
	
}
