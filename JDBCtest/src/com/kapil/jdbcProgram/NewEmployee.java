package com.kapil.jdbcProgram;

import java.util.*;
import java.sql.*;

public class NewEmployee {
	public static void main(String[] args) {
		
		int empno;
		String nm, dept, post, loc;
		float salary;
		Scanner sc=new Scanner(System.in);
		Connection con;
		PreparedStatement pst;
		 try {
			 	Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
				pst=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
				
				System.out.print("enter employee no :");
				empno=sc.nextInt();
				sc.nextLine();
				System.out.print("enter employee name :");
				nm=sc.nextLine();
				System.out.print("enter department :");
				dept=sc.nextLine();
				System.out.print("enter post :");
				post=sc.nextLine();
				System.out.print("enter location :");
				loc=sc.nextLine();
				System.out.print("enter salary :");
				salary=sc.nextFloat();
				
				pst.setInt(1,empno);
				pst.setString(2, nm);
				pst.setString(3, dept);
				pst.setString(4, post);
				pst.setString(5, loc);
				pst.setFloat(6, salary);
				
				pst.executeUpdate();
				System.out.println("Data added Successfully");
				con.close();
				
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	}
}
