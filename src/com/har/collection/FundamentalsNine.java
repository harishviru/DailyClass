package com.har.collection;

public class FundamentalsNine {

	       int i = 10;      //non-static /instance /object level variable
	       boolean b;
	       
	       static double d  =20.90;      // static /class level variable
	       
	public static void main(String[] args) {
		//System.out.println(i);//Cannot make a static reference to the non-static field i
		FundamentalsNine t = new FundamentalsNine();
		System.out.println(t.i);// 10(valid)
		System.out.println(t.b);
		t.methodOne();
		
		System.out.println("+++++++++++++++++++");
		System.out.println(FundamentalsNine.d);
		System.out.println(t.d);
		t.d =30.89;
		System.out.println(FundamentalsNine.d);
		System.out.println(t.d);
		
		
		FundamentalsNine t2 = new FundamentalsNine();
		System.out.println(t2.d);

	}

	public void methodOne() {
		System.out.println(i);// 10(valid)
	}
}
