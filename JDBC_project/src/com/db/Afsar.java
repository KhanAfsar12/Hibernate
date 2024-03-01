package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Afsar {
public static void main(String[] args) throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
	
	
	PreparedStatement ps = con.prepareStatement("insert into register values('Afsar' , 'ka484564@gmail.com' , 'kessuq54r' , 'male' , 'Mumbai')");
	int i = ps.executeUpdate();
	if (i > 0) {
		System.out.println("Success");
	}
	else {
		System.out.println("Fail execution");
	}
	con.close();
}
}
