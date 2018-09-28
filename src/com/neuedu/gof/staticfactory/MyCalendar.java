package com.neuedu.gof.staticfactory;


public abstract class MyCalendar {


	
	
	public static MyCalendar getInstance() {
		
		return create();
	}
	
	
	public static MyCalendar create() {
		return new MyCalendar() {
		};
	}
	
	
	public void print() {
		System.out.println("这是一个静态的方法");
	}
	
}
