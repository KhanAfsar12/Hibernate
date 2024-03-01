package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;

public class Employee {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emplyee","root","root");
			
			String s = "insert into department values('"+101+"','"+"IT"+"','"+"A"+"')"; 
			
			PreparedStatement psmt = connection.prepareStatement(s);
			
			int row = psmt.executeUpdate();
			
			if(row > 0) {
				System.out.println("Sucessful");
			}else {
				System.out.println("Unsucessful");
			}	
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
