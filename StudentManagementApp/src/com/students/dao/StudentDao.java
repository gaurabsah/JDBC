package com.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.students.model.Student;
import com.students.util.ConnectionProvider;

public class StudentDao {

	public static boolean insertStudent(Student student) {

		boolean f=false;
		try {
			Connection con = ConnectionProvider.createConnection();
			String q = "insert into students(sid,sname,sphone,scity) values(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setLong(3, student.getStudentPhone());
			pstmt.setString(4, student.getStudentCity());
			
			pstmt.executeUpdate();
			f=true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return f;

	}

}
