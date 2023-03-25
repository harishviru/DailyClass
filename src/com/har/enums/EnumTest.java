package com.har.enums;

public class EnumTest  {

	public static final double PIA_VAL=3.14;
	
	
	public static void main(String[] args) {
		System.out.println(PIA_VAL);
		System.out.println(NEWS.EAST.toString());
		System.out.println(NEWS.EAST.name());
		System.out.println(NEWS.EAST.ordinal());
		System.out.println(NEWS.SOUTH.ordinal());


		System.out.println("_________________________");
		
		for(NEWS  nConst:NEWS.values()) {
			 System.out.println(nConst.name());
		}
		System.out.println("++++++++++++++++++");
		NEWS  E=NEWS.valueOf("EAST");
		System.out.println(E);
		
		
		
		System.out.println("*****************************");
		DayOfWeek[] weeks=DayOfWeek.values();
		for(DayOfWeek week:weeks) {
			System.out.println(week.getName()  +"       "+ week.getVal());
		}

	}
	
	
}




