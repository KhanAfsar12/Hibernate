package com.jdbcProgram;

import java.sql.*;

public class Jdbc1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			 String url ="jdbc:mysql://localhost:3306/ayaz";
			 String username ="root";
			
			 Connection con = DriverManager.getConnection(url,username,"root");
			 
				String s = "insert into  khan_afsar values ('"+123+"','"+"afsar"+"')";
				  PreparedStatement ps = con.prepareStatement(s); ps.executeUpdate();
				
			 System.out.println("connection is created");
			  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
