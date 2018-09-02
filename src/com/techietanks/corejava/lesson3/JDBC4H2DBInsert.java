package com.techietanks.corejava.lesson3;

import java.sql.*;

public class JDBC4H2DBInsert {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";

	// Database credentials
	static final String USER = "sa";
	static final String PASS = "";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 3: Execute a query
			stmt = conn.createStatement();
			String sql = "INSERT INTO Registration " + "VALUES (100, 'Bhupinder', 'Singh', 88)";

			stmt.executeUpdate(sql);
			sql = "INSERT INTO Registration " + "VALUES (101, 'Parikshit', 'Singh', 25)";

			stmt.executeUpdate(sql);
			sql = "INSERT INTO Registration " + "VALUES (102, 'Zaid', 'Khan', 30)";

			stmt.executeUpdate(sql);
			sql = "INSERT INTO Registration " + "VALUES(103, 'Sumit', 'Mittal', 28)";

			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");

			// STEP 4: Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}
}
