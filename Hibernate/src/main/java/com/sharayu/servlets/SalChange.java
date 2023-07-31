package com.sharayu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;
import com.praffull.entities.*;

/**
 * Servlet implementation class SalChange
 */
public class SalChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalChange() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empno;
		float newsal;
		
		empno=Integer.parseInt(request.getParameter("empno"));
		newsal=Float.parseFloat(request.getParameter("newsal"));
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Query<Employee> q=ses.createQuery("update Employee set salary= :sal where empno= :eno");
		q.setParameter("sal", newsal);
		q.setParameter("eno", empno);
		
		int cnt=q.executeUpdate();
		ses.getTransaction().commit();
		
		System.out.println("records updated : "+cnt);
		
		if(cnt>0)
			response.sendRedirect("SalaryUpdateSuccess.jsp");
		else
			response.sendRedirect("SalaryUpdateFailed.jsp");
		
		ses.close();
	}

}
