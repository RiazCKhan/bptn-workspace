package com.bptn.course.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

	static String username = "riazkhan";
	static String password = "123";
	static String dbName = "feedapp";
	static String port = "5432";

	static String dbUrl = "localhost";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

//		Connection conn = null;

		String connStr = "jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName;

		try (Connection conn = DriverManager.getConnection(connStr, username, password)) {
			
			System.out.println("Connection Opened Successful");

		} catch (SQLException e) {
			e.printStackTrace();

		}
		
//		finally {
//
//			try {
//				if (conn != null) {
//					conn.close();
//
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//
//			}
//		}
	}

}
