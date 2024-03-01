package hibernate1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("enter id : \n");
		int id=Integer.parseInt(bb.readLine());
		System.out.printf("enter name : \n");
		String name =bb.readLine();
		System.out.printf("enter address :\n ");
		String addres=bb.readLine();
		Employee emp=new Employee();
	     emp.setId(id);
	     emp.setName(name);
	     emp.setAddres(addres);
	     JdbcOp op=new JdbcOp();
	     op.save(emp);
	     
	     
	}

}
