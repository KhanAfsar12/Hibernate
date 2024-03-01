package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Afsar2 {
public static void main(String[] args){
	String name1 = "Kaif";
	String Email1 = "ddsk2fmdc@gmail.com";
	String Password1 = "765432rt";
	String gender1 = "Make";
	String City1 = "Bengluru";
	
	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db" , "root" , "root")){
	
//	Class.forName("com.mysql.cj.jdbc.Driver");
    
    PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
     
    ps.setString(1,name1);
    ps.setString(2, Email1);
    ps.setString(3, Password1);
    ps.setString(4, gender1);
    ps.setString(5, City1);
    
    int i = ps.executeUpdate();
    if(i<0) {
    	System.out.println("Re try");
    }
    
    System.out.println("Ok");
    
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
