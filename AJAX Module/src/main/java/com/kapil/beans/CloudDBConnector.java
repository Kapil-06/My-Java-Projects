package com.kapil.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class CloudDBConnector {
	
	private Connection dbconn;
	
	public CloudDBConnector() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbconn=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public Connection getDbconn() {
		return dbconn;
	}
	
	
}
