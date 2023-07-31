package com.sharayu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.praffull.entities.Employee;

/**
 * Servlet implementation class EmpDelete
 */
public class EmpDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empno;
		
		empno=Integer.parseInt(request.getParameter("empno"));
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Query<Employee> q=ses.createQuery("delete from Employee where empno= :eno");
		q.setParameter("eno", empno);
		
		int cnt=q.executeUpdate();
		ses.getTransaction().commit();
		
		System.out.println("records deleted : "+cnt);
		
		if(cnt>0)
			response.sendRedirect("EmpDeleteSuccess.jsp");
		else
			response.sendRedirect("EmpDeleteFailed.jsp");
		
	}

}
