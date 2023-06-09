package com.netbankingapplication.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.*;
/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id, ps, unm;
		int ano=0;
		String atype;
		Connection con;
		PreparedStatement pst, pst1;
		ResultSet rs, rs1;
		
		id=request.getParameter("uid");
		ps=request.getParameter("psw");
		
		//System.out.println(id+" "+ps);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from users where userid=? and pswd=? and userstatus='active'");
			pst.setString(1, id);
			pst.setString(2, ps);
			rs=pst.executeQuery();
			
			
			if(rs.next()){
				// System.out.println("correct");
				ano=rs.getInt("accno");
				unm=rs.getString("usernm");

				pst1=con.prepareStatement("select * from accounts where accno=?");
				pst1.setInt(1, ano);
				rs1=pst1.executeQuery();
				rs1.next();
				//System.out.println("acctype :"+rs1.getString("acctype"));
				atype=rs1.getString("acctype");
				
				HttpSession ses=request.getSession(true);
				ses.setAttribute("userid", id);
				ses.setAttribute("accno", ano);
				ses.setAttribute("usernm", unm);
				ses.setAttribute("acctype", atype);
;				response.sendRedirect("Customer.jsp");
			}
			else {
				System.out.println("wrong");
				response.sendRedirect("AuthFailure.jsp");
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
