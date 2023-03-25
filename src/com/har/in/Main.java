package com.har.in;

public class Main {

	
	//#03.
	public static void main(String[] args) {
		
		//#01
		Machine m =new Machine();
		m.accessRam();
		
	//#02
		Machine m1 =new Machine(); 
		Machine.RAM r =m1.new RAM();
		  r.ramVal();
		
		//#03  
		  new Machine().new RAM().ramVal();
		  
		  
		  
		  
	}
	
}
