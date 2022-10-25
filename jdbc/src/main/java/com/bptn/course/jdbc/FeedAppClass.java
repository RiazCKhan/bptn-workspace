package com.bptn.course.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FeedAppClass {

	static String username = "labber";
	static String password = "123";
	static String dbName = "feedapp";
	static String port = "5432";
	static String dbUrl = "localhost";

	static void addUser(String connectStr, String _name, String _emailID, String _phoneNum, String _password,
			String _username) {
		ResultSet rs = null;

		String queryStr = "INSERT INTO \"UserID\" (\"name\", \"emailID\", \"phoneNumber\", \"userPassword\", \"username\") VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = DriverManager.getConnection(connectStr, username, password);
				PreparedStatement stateVal = conn.prepareStatement(queryStr);) {
			stateVal.setString(1, _name);
			stateVal.setString(2, _emailID);
			stateVal.setString(3, _phoneNum);
			stateVal.setString(4, _password);
			stateVal.setString(5, _username);

			int numOfRows = stateVal.executeUpdate();

			System.out.println("Rows inserted " + numOfRows);
			System.out.println("Insert Executed Successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println("Query Execution Error");
					e.printStackTrace();
				}
			}
		}
	}

	static void getAllUsers(String connectStr) {
		String queryStr = "SELECT * FROM \"UserID\"";

		try (Connection conn = DriverManager.getConnection(connectStr, username, password);
				Statement stateVal = conn.createStatement();
				ResultSet rs = stateVal.executeQuery(queryStr);) {

			while (rs.next()) {
				System.out.print("Name: " + rs.getString("name") + " | ");
				System.out.print("Email: " + rs.getString("emailID") + " | ");
				System.out.print("Phone #: " + rs.getString("phoneNumber") + " | ");
				System.out.print("Password: " + rs.getString("userPassword") + " | ");
				System.out.print("Username: " + rs.getString("username") + " ");
				System.out.println("");
			}

		} catch (SQLException e) {
			System.out.println("Query Execution Error");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		String connectionString = "jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName;

		addUser(connectionString, "Mihael Clue", "MC@mail.com", "511", "123", "MQ");
		getAllUsers(connectionString);

	}
}