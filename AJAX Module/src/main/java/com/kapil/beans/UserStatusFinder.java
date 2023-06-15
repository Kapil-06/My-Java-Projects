package com.kapil.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserStatusFinder {
	
	private String userid;
	private String status;
	
	public UserStatusFinder() {
		userid="";
		status="";
	}

	public String getStatus() {
		return status;
	}

	public void setUserid(String userid) {
		this.userid = userid;
		userStatus();
	}
	
	private void userStatus() {
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try {
			CloudDBConnector db=new CloudDBConnector();
			con=db.getDbconn();
			
			pst=con.prepareStatement("Select * from users where userid=?");
			pst.setString(1, userid);
			rs=pst.executeQuery();
			
			if(rs.next()) 
				status="failed";
			else
				status="success";
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
