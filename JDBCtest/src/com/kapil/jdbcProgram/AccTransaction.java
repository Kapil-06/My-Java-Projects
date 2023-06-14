package com.kapil.jdbcProgram;

import java.util.*;
import java.sql.*;

public class AccTransaction {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Connection con;
		PreparedStatement pst;
		int accno;
		float amt;
		String trans;
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			System.out.print("enter accno : ");
			accno=sc.nextInt();
			sc.nextLine();
			System.out.println("Transactions (deposit/withdraw) : ");
			trans=sc.nextLine();
			System.out.print("enter amt : ");
			amt=sc.nextFloat();
			
			if(trans.equalsIgnoreCase("deposit"))
				pst=con.prepareStatement("Update accounts set balance=balance+? where accno=?");
			else
				pst=con.prepareStatement("Update accounts set balance=balance-? where accno=?");
			
			
			pst.setFloat(1, amt);
			pst.setInt(2, accno);
			
			int cnt=pst.executeUpdate();
			
			if(cnt==1)
				System.out.println("Balance updation successfully");
			else
				System.out.println("Account does not exits");
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
