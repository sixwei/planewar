package com.neuedu.gof.staticfactory;

import java.util.Calendar;

public class TestMyCalendar {
	
	
	public static void main(String[] args) {
		MyCalendar mycalendara = MyCalendar.getInstance();
		mycalendara.print();
		
		Calendar calendar = Calendar.getInstance();
		
		Calendar calendar2 = Calendar.getInstance();
		
		if(calendar.equals(calendar2)) {
			System.out.println("singlen");
		}else {
			System.out.println("not singlen");
		}
		
	}
	
	
	
	
	
	

}
