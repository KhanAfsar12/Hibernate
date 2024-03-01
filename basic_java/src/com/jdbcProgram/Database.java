package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {
public static void main(String[] args) throws Exception{
	
	String name1 ="Farman";
	String email ="farman@gmail.com";
	String password ="m5432vcs87";
	String gender ="Male";
	String City ="Banglore";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbd_db","root","root");
	PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
	ps.setString(1, name1);
	ps.setString(2, email);
	ps.setString(3, password);
	ps.setString(4, gender);
	ps.setString(5, City);
	
	int i = ps.executeUpdate();
	if (i>0) {
		System.out.println("Successfull");
	}
	else {
		System.out.println("fail");
	}
}
}