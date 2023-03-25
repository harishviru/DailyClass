package com.har.lan;

public class ExampleOne {

	String name;

	public ExampleOne(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//m1();
		ExampleOne eOne = new ExampleOne("Balu");
		ExampleOne eTwo = new ExampleOne("Saleem");
		ExampleOne eThree = new ExampleOne("Srinu");
		System.out.println(eOne);          //eOne.toString();
		
		
		
	}

	private static void m1() {
		ExampleOne eOne = new ExampleOne("Balu");
		ExampleOne eTwo = new ExampleOne("Saleem");
		ExampleOne eThree = new ExampleOne("Srinu");

		System.out.println(eOne.toString());
		System.out.println(eTwo.name);
		System.out.println(eThree);
		
		Integer iOne =new Integer(10);
		System.out.println(iOne);
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		System.out.println("ExampleOne.hashCode()");
		return name.hashCode()+1;
	}

}
