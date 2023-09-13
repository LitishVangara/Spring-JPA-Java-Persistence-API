package org.jsp.springJPA.dao;

import java.util.List;

import org.jsp.springJPA.entity.Student;

public interface StudentDAO 
{
	//Insert Data in Table
	void addStudent(Student s1);
	//Delete Data from Table by using rollNo
	int deleteStudent(int rollNo);
	//Search Data by Using rollNo
	Student getStudentDetails(int rollNo);
	//Search All Student Data
	List<Student> getAllStudentDetails();
	//Update Student Details
	Student updatePercentage(int rollNo, String percentage);
	//Search Student Data By Name
	List<Student> getStudentDetailsByName(String studentName);
	//Find by Percentage Greater Than
	List<Student> findStudentPercentageGreaterThan(String percentage);
}
