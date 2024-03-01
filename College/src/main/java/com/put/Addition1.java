package com.put;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Addition1")
public class Addition1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Addition1() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Enter into Servlet");
		String number1 = request.getParameter("no1");
		String number2 = request.getParameter("no2");
		
		int no1 = Integer.parseInt(number1);
		int no2 = Integer.parseInt(number2);
		
		int sum = no1+no2;
		
		String result = String.valueOf(sum);
		
		request.setAttribute("result",result);
		RequestDispatcher rd = request.getRequestDispatcher("AdditionofTwoN.jsp");
		rd.forward(request, response);
		
	}

}
