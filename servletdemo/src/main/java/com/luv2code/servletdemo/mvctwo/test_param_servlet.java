package com.luv2code.servletdemo.mvctwo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test_param_servlet
 */
@WebServlet("/test_param_servlet")
public class test_param_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test_param_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h1>Sahil</h1><br/><h1>Jamal</h1>");
		
		ServletContext servletContext = getServletContext();
		String name = servletContext.getInitParameter("project-team-name");
		String name1 = servletContext.getInitParameter("max-shopping-cart-size");
		
		printWriter.print("<h1>"+name+"</h1>");
		printWriter.print("<h1>"+name1+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
