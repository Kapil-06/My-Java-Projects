package com.kapil.jdbcProgram;
import java.sql.*;

public class TryDriver {
	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("welcome to jdbc");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver test successfully");
	}
}
