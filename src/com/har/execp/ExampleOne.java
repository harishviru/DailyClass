package com.har.execp;

public class ExampleOne {

	
	public static void main(String[] args) {
		int result =m4();
		System.out.println(result);
	}

	private static int m4() {
		try {
			System.out.println("try block executed");
			System.exit(10);
			
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
			return 40;
		} finally {
			System.out.println("finally block executed");
			return 90;
		}
	}

	private static void m3() {
		String s =null;
		try{
			s.length();
		}catch (NullPointerException e) {
			System.out.println(e.toString());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static void m2() {
		System.out.println("statement1");
		try{
			System.out.println(10/0);
			}catch(Exception e){
			     System.out.println(10/2);
			}
			System.out.println("statement3");
	}
	
	static void mOne(){
		String s =null;
		try {
			s.length();
		}catch (Exception e) {
			//System.out.println(" execption due to null value :"+e.getMessage());
			s =new String("BALU");
		}
		System.out.println(s);
	}
	
}
