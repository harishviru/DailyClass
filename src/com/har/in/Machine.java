package com.har.in;

public class Machine {
	
	  class RAM{    // INNER CLASS
		  public void ramVal() {
			  System.out.println("Machine.RAM.ramVal() :8GB");
		  }
	  }

	  public void accessRam() {
		  RAM ram =new RAM();
		  ram.ramVal();
	  }
	  
	
}
