package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Afsar1 {
	public static void main(String[] args) throws Exception {
		String name = "Ibrahim";
		String Email = "fea@849cgmail.com";
		String Password = "sdmdis4238";
		String Gender = "Male";
		String City = "Delhi";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into register values('" + name + "' , '" + Email + "' , '"
				+ Password + "' , '" + Gender + "' , '" + City + "')");

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Executed");
		} else {
			System.out.println("Not executed");
		}
		con.close();
	}
}
