package com.har.lan;

public class StringExample {

	public static void main(String[] args) {
		
		//constructors();
		//strMethods();
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("abcdefghijklmnop");
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		sb.append("6");
		System.out.println(sb.capacity());

		StringBuffer sb1=new StringBuffer(1000);
		sb1.append("h");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuffer sb3=new StringBuffer();
		sb3.append("PI value is :");
		 System.out.println(sb3);//

		sb3.append(3.14);
		 System.out.println(sb3);//

		sb3.append(" this is exactly ");
		 System.out.println(sb3);//

		sb3.append(true);
		 System.out.println(sb3);//
		 
		 StringBuffer sb4=new StringBuffer("abcdefgh");
		sb4.insert(2, "xyz");
		 sb4.insert(11,"9");
		 System.out.println(sb4);//
		 System.out.println(sb4.reverse());//

		 System.out.println(sb4.delete(2, 5));//
		 StringBuffer sb5=new StringBuffer("ashokkumar");
		 System.out.println(sb5);

		 sb5.setLength(6);
		 System.out.println(sb5);//ashokk
		 

	}


	private static void strMethods() {
		String s="ashok";
		
		System.out.println(s.charAt(3));
		//System.out.println(s.charAt(100));
		
		//s=s.concat("software");
		  //s=s+"software";
		  s+="software";
		System.out.println(s);
		
		String s1="ashok";
		String s2="ASHOK";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		String s3="ashoksoft";
		System.out.println(s3.substring(5));
		//System.out.println(s3.substring(50));
		System.out.println(s3.substring(5,8));
		System.out.println(s3.substring(5,s3.length()));
		
		System.out.println(s3.length());
		
		
		String s4="ababab";
		System.out.println(s4.replace('h','b'));
		
		String s5="aBaBaB";
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		String s8=s5.toUpperCase();
		
		String s9="     aba  bab           ";
      System.out.println(s9.trim());
      
      String s7="saicharan";
      System.out.println(s7.indexOf('c')); 
      System.out.println(s7.indexOf('z'));
      
      System.out.println(s7.indexOf('a'));
      System.out.println(s7.lastIndexOf('a'));

      final StringBuffer sb=new StringBuffer("ashok");
      sb.append("software");
	}

	private static void constructors() {
		String s=new String();
		System.out.println(s);
		String s1=new String("rohit");
		System.out.println(s1);

		StringBuffer sb =new StringBuffer("mahi");
		String s2=new String(sb);
		System.out.println(s2);

		char[] ch={'a','b','c'} ;
		String s3=new String(ch);
		System.out.println(s3);

		
		byte[] b={100,101,102};
		String s4=new String(b);
		System.out.println(s4);
	}
	
}
