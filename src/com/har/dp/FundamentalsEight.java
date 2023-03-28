package com.har.dp;

public class FundamentalsEight {

	public static void main(String[] args) {

		int[] a = new int[4];
		System.out.println(a.getClass());

		byte b = 20;

		short s = 30;
		char c = 'a';
		int f = 390;
		long l = 90;

		a[0] = b;
		a[1] = s;
		a[2] = c;
		// a[3]=l;
		a[3] = f;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		System.out.println("++++++++++++++++++++");

		for(int i=0;i<a.length;i++ ) {
			System.out.println(i    +"          --->   "+    a[i]);        // a[0]  a[1]  a[2]  a[3]
		}
		
		System.out.println("__________________________--");


		//N.PDT
		Number []   n  =new Number[4];
		byte by =10;
		n [0]   =  new Byte(by);
		n [1]   =  new Integer(20);
		n[2]  =  new Float(20.09f);
		n[3]  =  new Double(20l);
		
		
	  for(int j=3;j>=0;j--) {
		  System.out.println( j   +"        -----"+n[j]);
	  }
		
	  String[]      strArr = {"h","s"};
	  Object[] objArr =strArr;
		
		
	}
}
