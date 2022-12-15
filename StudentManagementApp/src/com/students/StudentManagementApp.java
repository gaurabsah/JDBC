package com.students;

import java.util.Scanner;

import com.students.dao.StudentDao;
import com.students.model.Student;

public class StudentManagementApp {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Student Management App");

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("PRESS 1 to ADD student: ");
			System.out.println("PRESS 2 to DELETE student: ");
			System.out.println("PRESS 3 to DISPLAY student: ");
			System.out.println("PRESS 4 to UPDATE student: ");
			System.out.println("PRESS 5 to EXIT: ");

			int c = scn.nextInt();

			if (c == 1) {
//				Add Student

				System.out.println("Enter the Id of the student: ");
				int id = scn.nextInt();
				System.out.println("Enter the name of the student: ");
				String name = scn.next();
				System.out.println("Enter the phone number of the student: ");
				long phone = scn.nextLong();
				System.out.println("Enter the city of the student: ");
				String city = scn.next();

				Student student = new Student(id, name, phone, city);

				Boolean ans = StudentDao.insertStudent(student);

				if (ans) {
					System.out.println("Student details added successfully...!");
				}

			} else if (c == 2) {
//				Delete Student

			} else if (c == 3) {
//				Display Student details
			} else if (c == 4) {
//				Update Student details
			} else if (c == 5) {
//				Exit
				break;
			} else {

			}
		}
		System.out.println("Thank You for visiting the Application...!");
		System.out.println("See You Soon...!");
	}

}
