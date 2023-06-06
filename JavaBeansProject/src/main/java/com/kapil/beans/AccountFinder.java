package com.kapil.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class AccountFinder {

	private int accno;
	private double bal;
	private String accnm, atype;
	
	public void AccountFinder() {
		accno=0;
		accnm="Not Found";
		atype="Not Found";
		bal=0.0;
	}

	public double getBal() {
		return bal;
	}

	public String getAccnm() {
		return accnm;
	}

	public String getAtype() {
		return atype;
	}

	public void setAccno(int accno) {
		this.accno = accno;
		retriveData();
	}
	
	private void retriveData() {
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from accounts where accno=?");
			rs=pst.executeQuery();
			
			if(rs.next()) {
				accnm=rs.getString("accnm");
				atype=rs.getString("acctype");
				accno=rs.getInt("accno");
				bal=rs.getDouble("balance");
			}
			con.close();
			
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	
}
