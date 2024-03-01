package resort;
import javax.servlet.*;
import java.io.IOException;

public abstract class Firstjava implements Servlet{

	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating Object...........");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
	System.out.println("Servicing");	
	}
	
	public void destroy() {
		System.out.println("going to destroy servlet object");
	}
	
	//non-Life Cycle method 
	public ServletConfig getServletConfieg() {
		return this.conf;
	
		
	}
	
	public String getServletInfo() {
		return "This servlet is created by Afsar";
	}
}
