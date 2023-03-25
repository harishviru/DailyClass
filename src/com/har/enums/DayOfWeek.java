package com.har.enums;

import java.util.Arrays;
import java.util.List;

public enum DayOfWeek {

	MONDAY("mon", 100),
	TUESDAY("tue", 200),
	WEDNESDAY("wed", 300),
	THURSDAY("Thurs", 400),
	FRIDAY("fri", 500),
	STATURDAY("WeekOff#01", 1001),
	SUNDAY("WeekOff#02", 2002),
	NONE;

	
	 String name;
	 int val;
	
	 DayOfWeek(String name,int val) {
		System.out.println("DayOfWeek - 2 param constructor");
		this.name=name;
		this.val=val;
	}
	private DayOfWeek() {
		System.out.println("DayOfWeek. 0-param constructor)");
	}
	
	
	public String getName() {
		return name;
	}
	public int getVal() {
		return val;
	}
	
	public static void main(String... args) {
		DayOfWeek[] weeks=DayOfWeek.values();
		for(DayOfWeek week:weeks) {
			System.out.println(week.getName()  +"       "+ week.getVal());
		}
	}
	
	public List<DayOfWeek> valuesList(){
		return  Arrays.asList(values());
	}
}
