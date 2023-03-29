package com.har.dp;

public class FundamentalEleven {

	//class level variables
	//#01 .PDT
	  int a;                //non-static /instance/object level variables
	  static double  d;               //static /class -level variable
	  
	 
	//#02 .NPDT
	  // 02(01)
	  // arrays
	  int[]    intArr ;                      // non-static array
	  static double[]  dArr;        //static -array 
	  
	 // 02(02)
	  // class/interface/enum/anonatation
	  Sample  sample ;             //non-static 
	  static Sample  sOne;      // static  
	  
	
	public static void main(String[] args) {
		System.out.println(d);
		FundamentalEleven fe =new FundamentalEleven();
		System.out.println(fe.a);
		
		System.out.println("++++++++++++++++++");
		System.out.println(dArr);
		System.out.println(fe.intArr);
		
		int[]   aintArray = new int[2];
		int   k = 0;
		System.out.println("++++++++++++++++++");
		System.out.println(aintArray[0]);
		System.out.println(k);
		
		System.out.println("++++++++++++++++++");
		System.out.println(sOne);
		System.out.println(fe.sample);
		 Sample  spl = null; 
		 System.out.println(spl);
		
		
	}
}
class Sample{
	
}


