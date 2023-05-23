package com.kapil.jdbcProgram;

import java.util.*;
import java.sql.*;

public class TransferAmount {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Connection con;
		CallableStatement cst;
		int fa, ta;
		float amt;
		String rem;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			cst=con.prepareCall("{call transfer(?,?,?,?)}");
			
			System.out.print("Enter from accounts no : ");
			fa=sc.nextInt();
			System.out.print("Enter to accounts no : ");
			ta=sc.nextInt();
			System.out.print("Enter transaction amt : ");
			amt=sc.nextFloat();
			sc.nextLine();
			System.out.print("Enter remark : ");
			rem=sc.nextLine();
			
			cst.setInt(1, fa);
			cst.setInt(2, ta);
			cst.setFloat(3, amt);
			cst.setString(4, rem);
			
			int cnt=cst.executeUpdate();	
			if(cnt==1)
				System.out.println("Transfer successully");
			else
				System.out.println("Something went wrong");
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
