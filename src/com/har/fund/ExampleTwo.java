package com.har.fund;

public class ExampleTwo {
	
	public static void main(String[] args) {
		
		//pdTypes();
		//arrays();
		
		printArray(new int[] {22,12});
		
		
		
		
	}//main

	 public static void printArray(int[] a) {
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		 }
	 }
	
	private static void arrays() {
		//Arrays
	   // Synytax :     <DataType>  []   <Variable>	
	
		
		int[] numArray =new int[5];
		System.out.println(numArray);
		System.out.println();
		
		System.out.println(numArray.length);
		System.out.println(numArray.getClass());
		
		
		for(int i=0;i<numArray.length;i++) {
			System.out.print(numArray[i]   +"    ");
		}
		numArray[0]=90;
		numArray[1]=190;
		numArray[2]=290;
		numArray[3]=390;
		numArray[4]=490;
	//numArray[5]=590;       // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

		 System.out.println();
		for(int i=0;i<numArray.length;i++) {
			System.out.print(numArray[i]   +"    ");
		}
		System.out.println();
		//System.out.println(numArray[5]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		int a , b , c;
		a =40;
		b =50;
		c =48;
		
		
		double d =80l;
		
		String s =new String("harish");
		System.out.println(s);
		
		Object obj =new Object();
		 System.out.println(obj);
	}

	private static void pdTypes() {
		//DataType [ byte ,short,int,long,float,double ,char,boolean ,String
		
		byte b  =90;     // 1 byte
		short s =b;       // 2 bytes
		int  iVal =s;    //4 bytes
		
		long l =iVal;      //8 bytes;
		float   f =l;         // 4 bytes
		double d=f;      // 8 bytes                [[ These automatic casting will be taken care by Compiler]]
		
		
		char ch ='j';
		int   cVal =ch;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(iVal);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(cVal);
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		byte bt;       // declaration
		bt =120;      //assignment
		
		byte bh =120;    //In one line  [declaration +assignment]
	}
	
}//class




// single comment
/*  Multi Line comment
 * 
 * 
 */



