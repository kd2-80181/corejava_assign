package com.solution14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/JDBC";
	private static final String DB_USER = "KD2_80145_AbheyKhurana";
	private static final String DB_PASSWORD = "manager";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()throws SQLException
	{
		Connection conn=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return conn;
	}
}
