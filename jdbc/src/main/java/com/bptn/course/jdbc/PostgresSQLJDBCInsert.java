package com.bptn.course.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class PostgresSQLJDBCInsert {

	static String userName = "pguser";
	static String password = "AVNS_nk_TkJcE83RM5w4RpMI";
	static String dbName = "weatherDB";
	static String port = "25060";
	static String dbUrl = "cohort-1-section-2-team-2-do-user-12484302-0.b.db.ondigitalocean.com";

	public static void main(String[] args) {

		String conStr = "jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName;
		String sql = "INSERT INTO \"User\" (\"id\", \"firstName\", \"lastName\", \"emailID\", \"username\","
				+ " \"address\", \"phone\", \"isAdmin\", \"cityID\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, (CAST(? AS bit)), ?, ?)";

		try (Connection conn = DriverManager.getConnection(conStr, userName, password);
				PreparedStatement stmt = conn.prepareStatement(sql);) {

				stmt.setInt(1, 6);
				stmt.setString(2, "Joanne");
				stmt.setString(3, "Louis");
				stmt.setString(4, "JL@mail.com");
				stmt.setString(5, "WeatherWatcher");
				stmt.setString(6, "Guildwood Dr");
				stmt.setString(7, "8232");
				stmt.setInt(8, 1);
				stmt.setInt(9, 2);
				stmt.setTimestamp(10, new Timestamp(1660280600000L));

				int numOfRows = stmt.executeUpdate();
				System.out.println("Rows inserted " + numOfRows);
				System.out.println("Insert Executed Successfully");


		} catch (SQLException ex) {
			System.out.println("Error while running code");
			System.out.println("Exception:" + ex.getMessage());
		} 
	}
}