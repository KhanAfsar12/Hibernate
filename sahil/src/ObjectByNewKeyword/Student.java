package ObjectByNewKeyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp{
	    
	  private int id;
	  private String name;
	  private double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalry(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", depar=" + salary + "]";
	}
	   
	 
 }   







public class Student {
	
	
	public static void main(String[] args) {
		   Map<String, Double> emp =new HashMap<>();
		   emp.put("IT", 0.1);
		   emp.put("Medical", 0.07);
		   emp.put("MCA", 0.05);
		   
		    List<Emp> list = List.of(new Emp(1, "IT", 898389.0),
		    		       new Emp(2, "IT", 898389.0),
		    		       new Emp(3, "Medical", 898389.0),
		    		       new Emp(4, "Medical", 898389.0),
		    		       new Emp(5, "MCA", 898389.0),
		    		       new Emp(6, "MCA", 898389.0)
		    		);
		
		          list.stream().map(m -> {
		        	   if (m.getName().equals(emp.keySet())) {
		        		         m.setSalry(m.getSalary()+(m.getSalary()*emp.get(m.getName())));
		        		         
						
					}
		        	   return m;
		        	  
		          }
		                 
		          ).collect(Collectors.toList()).forEach(System.out::println);
		    
		
	}

}
