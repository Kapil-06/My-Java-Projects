package com.kapil.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckAccountName {
	
	int no;
	String nm;
	
	public CheckAccountName() {
		no=0;
		nm="";
	}

	public String getNm() {
		return nm;
	}

	public void setNo(int no) {
		this.no = no;
		retriveName();
	}
	
	private void retriveName() {
		
		Connection con;
		PreparedStatement pst; 
		ResultSet rs;
		
		try {
			CloudDBConnector db=new CloudDBConnector();
			con=db.getDbconn();
			
			pst=con.prepareStatement("select accnm from accounts where accno=?");
			pst.setInt(1, no);
			rs=pst.executeQuery();
			
			if(rs.next()) {
				nm=rs.getString("accnm");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
