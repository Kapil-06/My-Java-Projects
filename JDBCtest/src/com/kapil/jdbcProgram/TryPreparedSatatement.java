package com.kapil.jdbcProgram;
import java.sql.*;
import java.util.*;

public class TryPreparedSatatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		int no;
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
				pst=con.prepareStatement("Select * from accounts where accno=?");
				
				System.out.print("Enter account number to be search :");
				no=sc.nextInt();
				
				pst.setInt(1, no);
				rs=pst.executeQuery();
				while(rs.next()) {
					System.out.println("Name : "+rs.getString("accnm"));
					System.out.println("Balance : "+rs.getFloat("balance"));
				}
				
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
