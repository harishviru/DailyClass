package com.har.lan;

public class ExampleTwo {

	public static void main(String[] args) {
		ExampleTwo e = new ExampleTwo();
		ExampleTwo e1 = new ExampleTwo();

		Student s1 = new Student("Viru", 100);
		Student s2 = new Student("Vamsi", 200);
		Student s3 = new Student("Rahul", 300);
		Student s4 = new Student("Viru", 100);
		Student s5 = s2;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s2.equals(s5));

		System.out.println(s2.equals(e));
		System.out.println(s2.equals(10));
		System.out.println(s2.equals(null));
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		String sOne =new String("Harish");
		String sTwo =new String("Ramesh");
		String sThree =new String("suresh");
		String sFour =new String("Harish");
		String sFive =new String("harish");
		String sSix =sOne;
		String sSeven =new String("Harish ");
		
		System.out.println(sOne.equals(sTwo));
		System.out.println(sOne.equals(sThree));
		System.out.println(sOne.equals(sFive));
		System.out.println(sOne.equals(sFour));
		System.out.println(sOne.equals(sSix));
		System.out.println(sOne.equals(sSeven));
		
		
	  System.out.println("+++++++++++++++++++++++++++++");
		
		StringBuffer sbOne =new StringBuffer("Harish");
		StringBuffer sbTwo =new StringBuffer("Ramesh");
		StringBuffer sbThree =new StringBuffer("suresh");
		StringBuffer sbFour =new StringBuffer("Harish");
		StringBuffer sbFive =new StringBuffer("harish");
		StringBuffer sbSix =sbOne;
		StringBuffer sbSeven =new StringBuffer("Harish ");
		
		
		System.out.println(sbOne.equals(sbTwo));
		System.out.println(sbOne.equals(sbThree));
		System.out.println(sbOne.equals(sbFour));
		System.out.println(sbOne.equals(sbFive));
		System.out.println(sbOne.equals(sbSix));
		System.out.println(sbOne.equals(sbSix));

		  System.out.println("+++++++++++++++++++++++++++++");

		int x=10;
		int y=10;
		System.out.println(x==y);
		ExampleTwo eOne= new ExampleTwo();		
		ExampleTwo eTwo= new ExampleTwo();		
		System.out.println(eOne==eTwo);
		//System.out.println(eOne==sbSeven);
		
		
		Student studOriginal =new Student("Virat", 900);
		
		
		
		
		
		
	}

}

class Student { // Same Name + same rollNo : same

	String name;
	int rollNo;

	// Constructor -2 param
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Student) {
			Student stud = (Student) obj;
			
			if (this.name.equals(stud.name) && this.rollNo == stud.rollNo) {
				return true;
			}
			return false;
		}
		return false;
	}

}
