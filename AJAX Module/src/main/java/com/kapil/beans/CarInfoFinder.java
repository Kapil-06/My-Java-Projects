package com.kapil.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CarInfoFinder {

	private String company;
	private ArrayList<Car> carlist;
	
	public CarInfoFinder() {
		carlist=new ArrayList<>();
	}

	public void setCompany(String company) {
		this.company = company;
		System.out.println("company : "+company);
		retrieveData();
	}
	
	private void retrieveData() {
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		Car obj;
		
		try {
			CloudDBConnector db=new CloudDBConnector();
			con=db.getDbconn();
			
			pst=con.prepareStatement("Select * from products where company=?");
			pst.setString(1, company);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				obj=new Car();
				obj.setProdid(rs.getInt("prodid"));
				obj.setProdnm(rs.getString("prodnm"));
				obj.setPrice(rs.getDouble("price"));
				carlist.add(obj);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<Car> getCarlist() {
		return carlist;
	}
	
}
