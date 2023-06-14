package com.kapil.jdbcProgram;

import java.util.*;
import java.sql.*;

public class DeleteAcconts {
	public static void main(String[] args) {
		
		Connection con;
		PreparedStatement pst;
		Scanner sc=new Scanner(System.in);
		int no;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			pst=con.prepareStatement("delete from accounts where accno=?");
			
			System.out.print("enter accno to be delete :");
			no=sc.nextInt();
			
			pst.setInt(1, no);
			int cnt=pst.executeUpdate();
			if(cnt>0)
				System.out.println("account deleted successfully");
			else
				System.out.println("account not found");
			
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
