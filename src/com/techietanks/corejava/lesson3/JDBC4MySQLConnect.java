package com.techietanks.corejava.lesson3;

import java.sql.*;

public class JDBC4MySQLConnect {
	public static void main(String[] argv) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String connection = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String password = "toor";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(connection, user, password);
		if (!con.isClosed()) {
			con.close();
		}
	}
}
