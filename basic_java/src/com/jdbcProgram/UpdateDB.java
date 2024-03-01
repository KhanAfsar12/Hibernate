package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDB {
public static void main(String[] args) throws Exception{
	
	String city1 = "kolkata";
	String email1 = "ka484564@gmail.com";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbd_db","root","root");
	PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
	
	ps.setString(1, city1);
	ps.setString(2, email1);
	
	int i = ps.executeUpdate();
	
	if (i>0) {
		System.out.println("Successfully updated");
	}
	else {
		System.out.println("Failed updation");
	}
	con.close();
	
}
}
