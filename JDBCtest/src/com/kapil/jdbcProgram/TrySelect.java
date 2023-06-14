package com.kapil.jdbcProgram;
import java.sql.*;

public class TrySelect {
	public static void main(String[] args) {
		
		Connection con;
		Statement st;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			//System.out.println("successfully");
			
			st=con.createStatement();
			rs=st.executeQuery("select * from accounts");
			
			while(rs.next()) {
				System.out.print(rs.getString("accnm")+" : ");
				
				System.out.println(rs.getFloat("balance"));
			}
			
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
