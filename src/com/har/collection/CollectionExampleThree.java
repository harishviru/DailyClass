package com.har.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionExampleThree {

	public static void main(String[] args) {
		
		// Treeset 
		// treeset_1();
		//treeset_2();
		//compareTo_2();
		 //treeset_3();
		
		
		TreeSet   ts =new TreeSet<>(new MyComparator2() );
		ts.add("L");
		ts.add("S");
		ts.add("P");
		ts.add("M");
		ts.add("C");
		ts.add("H");
		ts.add("A");
		
		System.out.println(ts);
		
		
		
		
		
	}

	private static void treeset_3() {
		TreeSet   ts =new TreeSet<>( );
		
		 Employee  e1 =new Employee(100, "Laxman");
		 Employee  e2 =new Employee(101, "Chandu");
		 Employee  e3 =new Employee(104, "Suman");
		 Employee  e4 =new Employee(110, "Sai");
		 Employee  e5 =new Employee(190, "Pawan");
		 ts.add(e1);  // e1.compareTo(e2)
		 ts.add(e2);
		 ts.add(e3);
		 ts.add(e4);
		 ts.add(e5);
		 
			System.out.println(ts);
	}

	private static void compareTo_2() {
		String s ="A";
		
		 System.out.println(s.compareTo("Z"));   //ASC
		 
		 System.out.println(s.compareTo("z"));
		 
		String str ="K" ;
		
		System.out.println(str.compareTo("A"));
		
		System.out.println(s.compareTo("A"));
	}

	private static void treeset_2() {
		TreeSet   ts =new TreeSet<>();
		 ts.add("H");
		 ts.add("N");
		 ts.add("A");
		 ts.add("M");
		 ts.add("O");
		 ts.add("B");
		 ts.add("M");
		
		System.out.println(ts);
	}

	private static void treeset_1() {
		TreeSet   ts =new TreeSet<>();
		 //ts.add(null);
		 //ts.add("H");
		 ts.add(12);
		 ts.add(0);
		 ts.add(2);
		 ts.add(90);
		 ts.add(30);
		 ts.add(12);
		 
		 System.out.println(ts);
	}
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 =(Integer)o1;
		Integer i2 =(Integer)o2;
		
		if(i1.intValue()<i2.intValue()) {
			return +1;
		}else if(i1.intValue()>i2.intValue()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String   s1  =(String)o1;
		String   s2  =(String)o2;
		return  - s1.compareTo(s2);
	}
	
}

