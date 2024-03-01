package hibernate1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvde {
	 static Connection connection =null;
	 
	 private ConnectionProvde() {
		 
	 }
	 
	 public static Connection getCon() {
		 if(connection ==null) {
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 System.out.println("driver loaded");
				 
				 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayaz","root","root");
				 return connection;
				 
				 
			} catch (Exception e) {
			System.out.println(e);
			}
			 
			 
		 }
		 else {
			return connection;
			
		} return connection;
		
		 
		 
	 }
	    
        
}
