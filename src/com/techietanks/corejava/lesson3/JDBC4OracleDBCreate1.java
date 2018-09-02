package com.techietanks.corejava.lesson3;

import java.sql.*;

public class JDBC4OracleDBCreate1 {
	public static void main(String... ar) {
		try {

			// SQL CREATE TABLE query
			String query = "CREATE TABLE USER905 (" + "ID int," + "NAME varchar2(30)," + "PASSWORD varchar2(30),"
					+ "EMAIL varchar2(30)," + " COUNTRY varchar2(30))";
			// Loading and registering Oracle database thin driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Creating a connection between Java program and Oracle database.
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "uhl", "uhl123123");

			// Creating a Statement object to excute SQL statements
			Statement stmt = con.createStatement();

			// Executing a SQL query using Statement object.
			int count = stmt.executeUpdate(query);

			System.out.println("Total rows updated " + count);
		} catch (Exception e) {
			System.out.println(e);
		}
	} // main method() ends
}
