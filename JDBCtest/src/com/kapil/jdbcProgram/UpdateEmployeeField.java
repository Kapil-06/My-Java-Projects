package com.kapil.jdbcProgram;

import java.util.*;
import java.sql.*;

public class UpdateEmployeeField {
	public static void main(String[] args) {
		int empno;
		float sal;
		Scanner sc=new Scanner(System.in);
		Connection con;
		PreparedStatement pst;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			pst=con.prepareStatement("Update employee set salary=? where empno=?");
			
			System.out.print("enter employee no :");
			empno=sc.nextInt();
			System.out.print("enter new salary :");
			sal=sc.nextFloat();
			
			pst.setInt(1, empno);
			pst.setFloat(2,sal);
			int cnt=pst.executeUpdate();
			
			if(cnt==1) {
				System.out.println("Salary update Successfully");
			}else {
				System.out.println("Employee Not Found");
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
