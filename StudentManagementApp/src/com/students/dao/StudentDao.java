package com.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.students.model.Student;
import com.students.util.ConnectionProvider;

public class StudentDao {

	public static boolean insertStudent(Student student) {

		boolean f = false;
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "insert into student (sid,sname,sphone,scity) values (?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setLong(3, student.getStudentPhone());
			pstmt.setString(4, student.getStudentCity());

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

	public static boolean deleteStudent(int userId) {
		boolean f = false;
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "delete from student where sid=?";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, userId);

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

	public static void showAllStudents() {

		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "select * from student";

			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(q);

			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				Long phone = result.getLong(3);
				String city = result.getString(4);

				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Phone: " + phone);
				System.out.println("City: " + city);

				System.out.println("++++++++++++++++++++++++++");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
