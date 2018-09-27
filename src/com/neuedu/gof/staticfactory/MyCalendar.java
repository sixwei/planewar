package com.neuedu.gof.staticfactory;

import java.util.Calendar;

public abstract class MyCalendar {
	
	
	
	
	public static  class Builder{
		
		
		public static MyCalender getInstance(){
			
			return MyCalendar.class.getClassLoader().loadClass("MyCalendar");
		}
	}

}
