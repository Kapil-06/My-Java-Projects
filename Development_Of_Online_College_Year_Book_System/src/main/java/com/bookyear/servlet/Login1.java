package com.bookyear.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Login1
 */
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id, ps, utype;
		
		Connection con;
		PreparedStatement pst, pst1;
		ResultSet rs, rs1;
		
		id=request.getParameter("username");
		ps=request.getParameter("password");
		utype=request.getParameter("utype");
		
		//System.out.println(id+" "+ps);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from REGISTER where username=? and password=? and utype=?");
			pst.setString(1, id);
			pst.setString(2, ps);
			pst.setString(3, utype);
			rs=pst.executeQuery();
			
			if(utype.equalsIgnoreCase("student")) {
				response.sendRedirect("Student.jsp");
			}
			if(utype.equalsIgnoreCase("teacher")) {
				response.sendRedirect("Teacher.jsp");
			}
			if(utype.equalsIgnoreCase("admin")) {
				response.sendRedirect("Admin.jsp");
			}
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			response.sendRedirect("AuthFailure.jsp");
		}
	}

}
