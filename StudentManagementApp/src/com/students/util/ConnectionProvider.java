package com.students.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;

	public static Connection createConnection() {

		try {
//			load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

//			create the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin123");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
