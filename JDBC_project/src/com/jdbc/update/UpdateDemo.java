package com.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
public static void main(String[] args) throws Exception{
	
	String name= "Ishaque";
	String email = "ddsk2fmdc@gmail.com";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root" , "root");
    PreparedStatement ps = con.prepareStatement("update register set name=? where email=?");
    ps.setString(1, name);
    ps.setString(2, email);
    
    int a = ps.executeUpdate();
    if (a > 0) {
		System.out.println("Ok that's all");
	}
    else {
		System.out.println("hosh me a naujawan");
	}
}
}
