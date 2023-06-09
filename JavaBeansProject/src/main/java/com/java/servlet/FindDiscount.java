package com.java.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.kapil.beans.CalculateDiscount;

/**
 * Servlet implementation class FindDiscount
 */
public class FindDiscount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindDiscount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nm;
		double amt, disc;
		
		//receive the request
		nm=request.getParameter("nm");
		amt=Double.parseDouble(request.getParameter("amt"));
		
		/*if(amt>15000) {
			disc=amt*15/100;
		}
		else {
			disc=amt*8/100;
		}*/
		
		CalculateDiscount cd=new CalculateDiscount();
		cd.setAmount(amt);
		disc=cd.getDiscount();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h3>Discount will be "+disc+"<h3>");
		out.println("<hr><a href='index.jsp'>Home</a>");
	}

}
