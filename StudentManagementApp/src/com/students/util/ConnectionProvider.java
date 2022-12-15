package com.students.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;

	public static Connection createConnection() {

		try {
//			load the driver
			Class.forName("com.oracle.jdbc.Driver");

//			create the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin123");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
