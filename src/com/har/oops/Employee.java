package com.har.oops;

public abstract class Employee {
	public abstract void  m1() ;
}

class HEmployee extends Employee{
	@Override
	public void m1() {
		System.out.println("m1 ");
	}
}
abstract class DEmployee extends HEmployee{
	public abstract void m1();
}

class America{
	public static void m1() {
		System.out.println("m1 :America");
	}
}
class India extends America{
	public static void m1() {
		System.out.println("m1 :India");
	}
}


