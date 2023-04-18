package com.har.flowcontrols;

public class ExampleOne {

	
	public static void main(String[] args) {
		
		//selection_statement_01();
		
	   //selection_statement_02();
		
		//iterative_statement_01();
		
     //  iterative_statement_02();

     //iterative_statement_03(); 
		
	//iterative_statement_04();
		
     // iterative_statement_05();
	
		//iterative_statement_06();
		
		//transfer_statement_1();

		int sumResult =sum(10, 20);
		
		System.out.println( "sumResult  :"+sumResult);
		
		test();
		
	}
	
	public static int sum(int a,int b) {
		int sum =a+b;
		return sum;
	}
	
	public static void  test() {
		System.out.println("*********1***************");
		for(int i=0   ;  i<10   ;i++) {
			if(i==8) {
				return;
			}
			System.out.println(i);
		}
		System.out.println("oooooo");
	}
	

	private static void transfer_statement_1() {
		for(int i=0   ;  i<10   ;i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
			
		}
		System.out.println("outside for loop");
		System.out.println("+++++++continue ++++++++++++++++++++++++");

		
		for(int i=0   ;  i<10   ;i++) {
			if(i%2==0) {
				//System.out.println("skiping no :"+i);
				continue;
				
			}
			System.out.println(i);
			
		}
		System.out.println("outside for loop");
	}

	private static void iterative_statement_06() {
		int intArray[] = {89,30,20,1,2,3,5,2,5,7,26,66};
		
		for( int     a             :   intArray  ) {
			System.out.println(a);
		}
	}

	private static void iterative_statement_05() {
		//		for(     ;  ;         ) {
		//			System.out.println("for -loop");
		//		}
		//	
		//		System.out.println("outside for -loop");  //Unreachable code
			
				int a =0;
			
				for(  System.out.println("HI");  a<5 ;   System.out.println("inc/dec")  ) {
					System.out.println("for -loop");
					a++;
					System.out.println("---------------------");
				}
	}

	private static void iterative_statement_04() {
		for(int i=0   ;  i<10   ;i++) {
			System.out.println(i);
		}
		System.out.println("+++++++++++++++++++++++++");
		int a[]  = {2,39,0,4,5,2,1,4,5,6,7,8,9112,5,67,90};
		
		for(int i=0   ;  i<a.length   ;i++) {
			System.out.println(a[i]);
		}
		System.out.println("+++++++++++++++++++++++++");
	}

	private static void iterative_statement_03() {
		//		
		//		do
		//			System.out.println("do while");
		//			while(true);
		//		
		//		System.out.println("outside do while ");   //Unreachable code
		//		
			
		//		final boolean result =true;
		//		do 
		//			System.out.println("do while");
		//		 while(result);
		//		
		//		System.out.println("outside do while ");  
		//		
			
		//		final boolean result =false;
		//		do 
		//			System.out.println("do while");        // it is reachable statement becoz it will first chance to execute this statement
		//		 while(result);
		//		
		//		System.out.println("outside do while ");   
		//	
				
				int a =20;
				int b=40;
				
				do {
					System.out.println(a+b);
				  a++;
				}while(a<b);
				
				System.out.println("outside do while ");
	}

	private static void iterative_statement_02() {
		//		final int x =0;
		//		
		//		 while(0>90) {
		//			 System.out.println(x);  // Unreachable code
		//		 }
		//		
		//		 System.out.println("T");
		
				
				int a =20;
				final int b =40;
				
				 while(a<b) {
					 System.out.println(a+b);
					 a++;
				 }
				
				 System.out.println("O");
	}

	private static void iterative_statement_01() {
		
		//#o1:
		final boolean result =true;
		while(result) {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}
		
		//System.out.println("4");        //Unreachable code
		
		//#o2:
		/*   while(false)
			   System.out.println("3");      //Unreachable code
		
		        System.out.println("4");
		
		 * 
		 * 
		 */
	}

	private static void selection_statement_02() {
		byte x=90;
			
			switch (x) {
			case  10:
				 System.out.println(" CASE :10 ");
				 break;
			case 20:
				 System.out.println("CASE :20");
				 break;
			case 30:
				System.out.println("CASE :30");
				break;
			case 40:
				System.out.println("CASE :40");
				break;
			default:
				System.out.println("default");
			}
	}

	private static void selection_statement_01() {
		int x=90;
		int y=30;
		int z=90;
		
		//scenories:01
		if(x>y) 
			System.out.println(x+" is greater than "+y);
		
		
		
		//scenories:02
		if(x>z) {
			System.out.println(x+" is greater than "+z);
		}else {
			System.out.println("else cond");
		}
		
		//scenories:03
		if(y>z) {
			System.out.println(" 1st");
		}else if(x>z) {
			System.out.println(" 2nd");
		}else if(x>y) {
			System.out.println(" 3rd");
		}
	}
		
}
