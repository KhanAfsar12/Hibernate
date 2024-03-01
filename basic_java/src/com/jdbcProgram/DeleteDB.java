package com.jdbcProgram;

import java.security.cert.CertPathValidatorException.BasicReason;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDB {
	public static void main(String[] args) throws Exception{
		
		String str = "farman@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbd_db","root","root");
		PreparedStatement ps = con.prepareStatement("delete from register where email=?");
		ps.setString(1, str);
		
		int i = ps.executeUpdate();
		
		if (i > 0) {
			System.out.println("successful");
		}
		else {
			System.out.println("Fail");
		}
		con.close();
	}

}
