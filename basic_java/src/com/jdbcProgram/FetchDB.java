package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.AttributedString;

import com.mysql.cj.protocol.Resultset;

public class FetchDB {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbd_db","root","root");
	PreparedStatement ps = con.prepareStatement("select * from register");
	Resultset rs = (Resultset) ps.executeQuery();
	while(((ResultSet) rs).next()) {
		String name1 = ((ResultSet) rs).getString("name");
		System.out.println("Name: "+ name1);
		
		String email1 = ((ResultSet) rs).getString("email");
		System.out.println("email: "+ email1);
		
		String password1 = ((ResultSet) rs).getString("password");
		System.out.println("password:"+ password1);
		
		String gender1 = ((ResultSet)rs).getString("gender");
		System.out.println("gender: "+gender1);
		
		String city1 = ((ResultSet)rs).getString("city");
		System.out.println("city: "+city1);
		
		System.out.println("-----------------------------------------------------------------------------------------------");
	}
}
}
