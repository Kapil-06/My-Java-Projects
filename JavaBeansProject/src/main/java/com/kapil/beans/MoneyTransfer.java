package com.kapil.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MoneyTransfer {
	
	private int fromacc;
	private int toacc;
	private double amt;
	private String remark;
	private String status;
	
	public MoneyTransfer() {
		fromacc=0;
		toacc=0;
		amt=0.0;
		remark="";
		status="";
	}

	public String getStatus() {
		transfer();
		return status;
	}

	public void setFromacc(int fromacc) {
		this.fromacc = fromacc;
	}

	public void setToacc(int toacc) {
		this.toacc = toacc;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	private void transfer() {
		Connection con;
		PreparedStatement pst;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Update accounts set balance=balance-? where accno=?");
			pst.setDouble(1, amt);
			pst.setInt(2, fromacc);
			pst.executeUpdate();
			System.out.println("Amount deducted from source account");
			
			pst=con.prepareStatement("Update accounts set balance=balance+? where accno=?");
			pst.setDouble(1, amt);
			pst.setInt(2, toacc);
			pst.executeUpdate();
			System.out.println("Amount added to destination account");
			
			pst=con.prepareStatement("insert into transferlog (fromacc,toacc,amount,transdt,remark)values(?,?,?,now(),?)");
			pst.setInt(1, fromacc);
			pst.setInt(2, toacc);
			pst.setDouble(3, amt);
			pst.setString(4, remark);
			pst.executeUpdate();
			System.out.println("transferlog maintained");
			
			status="success";
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			status="error";
		}
		
	}
	
}
