package com.har.fund;

public class Employee {

	String empName ;
	
	int x;          //instance PDT
	static int y;//Static PDT
	
	
	String addrs;  //instance NON-PDT
	static String comAddrs="HYD";   // static NON-PDT
	
	
	public Employee(   ) {
		System.out.println("Employee.0-param constructor");
	}
	
	public static void main(String[] args) {
		
		final int z=20;
		System.out.println(z);
		
		
		
		
		
		Employee emp =new Employee();
		emp.empName ="SALEEM";
		System.out.println(emp.empName);
		
		
		System.out.println(comAddrs);
		System.out.println(Employee.comAddrs);
		System.out.println(emp.comAddrs);

		
		
		
		
		Employee emp1 =new Employee();
		emp1.empName ="HARISH";
		System.out.println(emp1.empName);
		
		Employee emp2 =new Employee();
		System.out.println(emp2.empName);
		
		
		Employee emp3=new Employee();
		emp3.empName="SUMAN";
		emp3.m1();
		emp2.m1();
		emp1.m1();
		
		
		emp2.comAddrs="VIZAG";
		
		System.out.println(comAddrs);
		System.out.println(Employee.comAddrs);
		System.out.println(emp.comAddrs);

		
	}
	
	public void m1() {
		System.out.println(empName);
		
		
	}
	
	
}
