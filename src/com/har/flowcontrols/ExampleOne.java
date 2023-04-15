package com.har.flowcontrols;

public class ExampleOne {

	
	public static void main(String[] args) {
		
		//selection_statement_01();
		
		
	   byte x=90;
		
		switch (x) {
		case  10:
			 System.out.println(" CASE :10 ");
			 break;
		case 20:
			 System.out.println("CASE :20");
			 break;
		case 30:
			System.out.println("CASE :30");
			break;
		case 40:
			System.out.println("CASE :40");
			break;
		default:
			System.out.println("default");
		}
		
		
		
		
		
	}

	private static void selection_statement_01() {
		int x=90;
		int y=30;
		int z=90;
		
		//scenories:01
		if(x>y) 
			System.out.println(x+" is greater than "+y);
		
		
		
		//scenories:02
		if(x>z) {
			System.out.println(x+" is greater than "+z);
		}else {
			System.out.println("else cond");
		}
		
		//scenories:03
		if(y>z) {
			System.out.println(" 1st");
		}else if(x>z) {
			System.out.println(" 2nd");
		}else if(x>y) {
			System.out.println(" 3rd");
		}
	}
		
}
