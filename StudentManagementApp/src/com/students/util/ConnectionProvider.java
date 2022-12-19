package com.students.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;

	public static Connection createConnection() {

		try {
//			load the driver
			Class.forName("org.postgresql.Driver");

//			create the connection
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "admin123");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
