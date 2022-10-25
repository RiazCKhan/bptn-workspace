package com.bptn.course.jdbc;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;

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

		String sqlParam = "SELECT * FROM \"UserID\"";

		try (Connection conn = DriverManager.getConnection(connStr, username, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlParam);) {

			System.out.println("Connection Opened Successful");

			while (rs.next()) {
				System.out.println("Users: " + rs.getString("username"));
			}

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
