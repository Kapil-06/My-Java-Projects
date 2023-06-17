package com.kapil.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AccountTypeReport {
	
	private ArrayList<Account> acclist;
	private String acctype;
	
	public AccountTypeReport() {
		acclist=new ArrayList<>();
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
		retrieveData();
	}
	
private void retrieveData() {
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		Account obj;
		
		try {
			CloudDBConnector db=new CloudDBConnector();
			con=db.getDbconn();
			
			pst=con.prepareStatement("Select * from accounts where acctype=?");
			pst.setString(1, acctype);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				
				obj=new Account();
				obj.setAccnm(rs.getString("accnm"));
				obj.setAccno(rs.getInt("accno"));
				obj.setBalance(rs.getDouble("balance"));
				acclist.add(obj);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<Account> getAcclist() {
		return acclist;
	}

}

	

