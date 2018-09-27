package com.neuedu.gof;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		
		/**
		 * 抽象工厂模式
		 */
		Connection conn=null;
		PreparedStatement prep= null;
		
		try {
			Class.forName("");
			conn = DriverManager.getConnection("");
			prep = conn.prepareStatement("");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
