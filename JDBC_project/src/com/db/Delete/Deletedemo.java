package com.db.Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletedemo {
	public static void main(String[] args) throws Exception {
		String name = "ddsk2fmdc@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from register where email=?");
		ps.setString(1, name);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Ok that's all");
		} else {
			System.out.println("HOsh me a naujawan");
		}
	}

}
