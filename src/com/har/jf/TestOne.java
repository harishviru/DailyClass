package com.har.jf;

public class TestOne {

	
	String tName;   //Instance variables     //JVM Will provide default values 
	static String clgName; //static variables
	
	
	public static void main(String[] args) {
		// Object creation sytax :
		// <className> <ref> =new <Constructor>();
		//System.out.println(tName);
		TestOne ts = new TestOne();
		System.out.println(ts.tName);
		ts.instanceArea();
	//	IteratorDP ip =new IteratorDP();
		
		Employee eOne=new Employee(100, "laxman");
		Employee eTwo=new Employee(101, "saleem");
	}
	
	public void instanceArea() {
		System.out.println("TestOne.instanceArea()");
		System.out.println(tName);
	}
	

}

class Employee {

	int empId;
	String eName;
	
	//Constructor Syntax :
	//<AM> <className>(argumentList){
	//}
	
	public Employee(int empId, String eName) {
		this.empId = empId;
		this.eName = eName;
	}
}




