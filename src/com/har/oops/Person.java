package com.har.oops;

class Test{
	
}
public class Person  extends  Test{

	private String  name;
	private int age;
	
	
	//name
	public void setName(String name) {
		this.name=name;
	}	
	public String getName() {
		return name;
	}
	//age
	public void setAge(int age) {
		this.age=age;
	}
	public int  getAge() {
		System.out.println(this.getClass().getSuperclass());
		return age;
	}
	
}
