package com.kapil.jdbcProgram;
import java.util.*;
import java.sql.*;

public class TryInsert {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Connection con;
		PreparedStatement pst;
		int accno;
		String accnm, acctype;
		float balance;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
			
			System.out.print("Enter account number :");
			accno=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter accountat name :");
			accnm=sc.nextLine();
			System.out.print("Enter account type :");
			acctype=sc.nextLine();
			System.out.print("enter balance :");
			balance=sc.nextFloat();
			
			pst.setInt(1, accno);
			pst.setString(2, accnm);
			pst.setString(3, acctype);
			pst.setFloat(4, balance);
			
			pst.executeUpdate();
			System.out.println("Account data successfully added");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
