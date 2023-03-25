package com.har.dp;

public class FundamentalsSix {

	
	public static void main(String[] args) {
		
	  int[][]  a  =new int[2][2];
	  
    a[0][0] =20;
    a[0][1] =10;
    
    a[1][0] =40;
    a[1][1] =90;
    
    System.out.println("++++++++++++++++++++++++++");
    
    System.out.println(a[0][0]);
    System.out.println(a[0][1]);
	    
    System.out.println(a[1][0]);
    System.out.println(a[1][1]);
    
    System.out.println("**********************************");
    
    for(int s=0;s<a.length;s++) {
    	for(int t=0;t<a[s].length;t++) {
    		System.out.println(a[s][t]);
    	}
    }
    
    
	  
    System.out.println("++++++++++++++++++++++++++");

    int[][]  b =new int[2][];
    
    b[0]   = new int[4];
    b[0][0]= 29;
    b[0][1]= 19;
    b[0][2]= 39;
    b[0][3]= 49;
    
    b[1]   = new int[2];
    b[1][0]= 3;
    b[1][1]= 3;
    
    
    
	}
}
