package hibernate1;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.protocol.Resultset;

public class JdbcOp {
	
	public void save(Object o) {
		

		if( o instanceof Employee){
			Employee e=(Employee)o;
			try {
				
				
			
			Connection c=ConnectionProvde.getCon();
			System.out.println(c);
			
			  PreparedStatement ps=c.prepareStatement("insert into edata values(?,?,?)");
			  ps.setInt(1, e.getId());
			  ps.setString(2, e.getName());
			  ps.setString(3, e.getAddres());
			  int i=ps.executeUpdate();
			  if(i>0)
			  System.out.println("value inserted");
			  else 
				System.out.println("value is not inserted");
			
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
		}
		
		
	}

}
