package com.kapil.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class AccountFinder {

	private int ano;
	private double bal;
	private String anm, atype;
	
	public AccountFinder() {
		ano=0;
		anm="Not Found";
		atype="Not Found";
		bal=0.0;
	}
	
	public double getBal() {
		return bal;
	}



	public String getAnm() {
		return anm;
	}



	public String getAtype() {
		return atype;
	}



	public void setAno(int ano) {
		this.ano = ano;
		reteriveData();
	}



	private void reteriveData() {
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from accounts where accno=?");
			pst.setInt(1, ano);
			rs=pst.executeQuery();
			
			if(rs.next()) {
				anm=rs.getString("accnm");
				atype=rs.getString("acctype");
				ano=rs.getInt("accno");
				bal=rs.getDouble("balance");
			}
			con.close();
			
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	
}
