package com.har.oops;

public class Main {

	public static void main(String[] args) {
	
		Person p =new Person();
		p.setAge(100);
		p.setName("balu");
		
		System.out.println(p.getAge());
		System.out.println(p.getName());

		System.out.println("++++++++++++++++++++++++++");
		//#01
		Parent pOne=new Parent();
		pOne.m1();
		//pOne.m2();
		
		//#02
		Child cOne =new Child();
		cOne.m1();
		cOne.m2();
		
		//#03 
		Parent pTwo =new Child();
		pTwo.m1();
		//pTwo.m2();
		
		//#04
		//Child cTwo=(Child) new Parent();
		
		System.out.println("end.........!");

	}

}
