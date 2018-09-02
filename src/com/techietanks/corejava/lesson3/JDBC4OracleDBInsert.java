package com.techietanks.corejava.lesson3;

import java.sql.*;

public class JDBC4OracleDBInsert {
	public static void main(String... ar) {
		try {
			String query1 = "INSERT INTO MyTable (ID, FirstName, LastName, Age)"
					+ "VALUES ('1', 'Tom', 'Hanks', '61 ')";

			String query2 = "INSERT INTO MyTable (ID, FirstName, LastName, Age)"
					+ "VALUES ('2', 'Johnny', 'Depp', '54')";

			String query3 = "INSERT INTO MyTable (ID, FirstName, LastName, Age)"
					+ "VALUES ('3', 'Leo', 'Dicaprio', '42')";

			// Loading and registering Oracle database thin driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Creating a connection between Java program and Oracle database.
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "uhl", "uhl123123");

			// Creating a Statement object to excute SQL statements
			Statement stmt = con.createStatement();

			// Executing a SQL INSERT query using executeUpdate() method of Statement
			// object.
			int count = stmt.executeUpdate(query1);
			System.out.println("Number of rows updated in database =  " + count);

			// Executing next SQL INSERT query using executeUpdate() method of Statement
			// object.
			count = stmt.executeUpdate(query2);
			System.out.println("Number of rows updated in database = " + count);

			// Executing next SQL INSERT query using executeUpdate() method of Statement
			// object.
			count = stmt.executeUpdate(query3);
			System.out.println("Number of rows updated in database = " + count);
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}// main() defintion ends
}
