package com.har.lan;

public class ExampleThree {

	
	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		//ex5();
		
		//ex6();
		
		
		String s1=new String("bhaskar");
		String s2=s1.concat("software");
		String s3=s2.intern();
		String s4="bhaskarsoftware";
		System.out.println(s3==s4);//
		
	}

	private static void ex6() {
		String s1=new String("bhaskar");
		String s2=s1.intern();
		System.out.println(s1==s2); 
		String s3="bhaskar";
		System.out.println(s2==s3);
	}

	private static void ex5() {
		String s1=new String("you cannot change me!");
		String s2=new String("you cannot change me!");
		System.out.println(s1==s2);
		String s3="you cannot change me!";
		System.out.println(s1==s3);
		String s4="you cannot change me!";
		System.out.println(s3==s4);
		String s5="you cannot "+"change me!";
		System.out.println(s3==s5);
		String s6="you cannot ";
		String s7=s6+"change me!";
		System.out.println(s3==s7);
		final String s8="you cannot ";
		String s9=s8+"change me!";
		System.out.println(s3==s9);
		System.out.println(s6==s8);
	}

	private static void ex4() {
		String s1=new String("spring");
		s1.concat("fall");
		s1=s1+"winter";
		
		String s2=s1.concat("summer");
		System.out.println(s1);
		System.out.println(s2);
	}

	private static void ex3() {
		String s=new String("bhaskar");
		s.concat("software");
		s=s.concat("solutions");
		s="bhaskarsoft";
	}

	private static void ex2() {
		String s1=new String("bhaskar");
		String s2=new String("bhaskar");
		String s3="bhaskar";
		String s4="bhaskar";
	}

	private static void ex1() {
		System.out.println("++++1+++");
		//#01
		String s=new String("bhaskar");
		s.concat("software");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("bhaskar");
		sb.append("software");
		System.out.println(sb);		
		
		System.out.println("++++2+++");
		
		//#02
		String s1=new String("ashok");
		String s2=new String("ashok");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1 = new StringBuffer("ashok");
		StringBuffer sb2 = new StringBuffer("ashok");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));	
		
		//#03 :
		String st=new String("bhaskar");
		String st1="bhaskar";
	}
	
	
	
}
