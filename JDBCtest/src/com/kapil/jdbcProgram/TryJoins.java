package com.kapil.jdbcProgram;

import java.util.*;
import java.sql.*;

public class TryJoins {
	public static void main(String[] args) {
		
		Connection con;
		Statement st;
		ResultSet rs;
		Scanner sc=new Scanner(System.in);
		int no;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			st=con.createStatement();
			rs=st.executeQuery("select customers.custnm,products.prodnm from customers inner join products on customers.prodid=products.prodid");
			
			while(rs.next())
			{
				System.out.println(rs.getString("custnm")+" purchased "+rs.getString("prodnm"));
			}
				con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
