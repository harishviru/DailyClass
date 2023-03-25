package com.har.enums;

public enum Month {

	JAN, FEB("XYZ",200), Mar("MARCH"); // public static final Month JAN =new Month();   public static final Month Mar =new Month("MARCH");

	private Month() {
		//super("constantName",ordinalVal)
		System.out.println("o-param constrcutor");
	}

	private String monthName;
	private int index;

	private Month(String name) {
		System.out.println("1-param constrcutor");
		this.monthName = name;
	}
	private  Month(String monthName, int index) {
		System.out.println("2-param constrcutor");
		this.monthName = monthName;
		this.index = index;

	}
	
	private String getMonthName() {
		return monthName;
	}
	private int getIndex() {
		return index;
	}
	


	public static void main(String... args) {

		System.out.println(Month.class.getSuperclass());

		System.out.println(JAN.name());
		System.out.println(JAN.ordinal());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Month jan = Month.valueOf("JAN");
		System.out.println(jan);

		Month none = Month.valueOf("Mar");
		System.out.println(none.name()  +" "+none.getMonthName());
		System.out.println(none.ordinal());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

		System.out.println(FEB.name());
		System.out.println(FEB.ordinal());
		System.out.println(FEB.monthName);
		System.out.println(FEB.index);
  System.out.println();
		
		System.out.println(Mar.name());
		System.out.println(Mar.ordinal());
		System.out.println(Mar.monthName);
		System.out.println(Mar.index);
		System.out.println("***************************************************");
		Month[] months=Month.values();
		for(Month mon:months) {
			System.out.println(mon.ordinal()     +"     "+mon.index +  " <>"+mon.name()   +"   "+mon.monthName);
		}
	}

}
