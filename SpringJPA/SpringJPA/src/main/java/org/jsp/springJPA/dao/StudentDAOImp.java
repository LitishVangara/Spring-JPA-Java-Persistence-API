package org.jsp.springJPA.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.springJPA.entity.Student;
import org.jsp.springJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDAOImp implements StudentDAO
{
	//Implementation Class Object Will get Inject
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void addStudent(Student s1) 
	{
		//Insert Records
		//Internally - Call persist Method
		studentRepository.save(s1);
	}
	@Override
	public int deleteStudent(int rollNo) 
	{
		try 
		{
			studentRepository.deleteById(rollNo);
			return 1;
		} 
		catch (Exception e) 
		{
			return 0;
		}
	}
	@Override
	public Student getStudentDetails(int rollNo) 
	{
		//Optional<Student> opt = studentRepository.findById(rollNo);
		//Student s1 = opt.get();
		try 
		{
			Student s1 = studentRepository.findById(rollNo).get();
			return s1;
		} 
		catch (Exception e) 
		{
			return null;
		}
	}
	@Override
	public List<Student> getAllStudentDetails() 
	{
		List<Student> list = studentRepository.findAll();
		return 	list;
	}
	@Override
	public Student updatePercentage(int rollNo, String percentage) 
	{
		//Retrieve Data
		try 
		{
			Student s2 = studentRepository.findById(rollNo).get();
			//Update Percentage
			s2.setPercentage(percentage);
			//Save the Data
			Student s3 = studentRepository.save(s2);
			return s3;
		} 
		catch (Exception e) 
		{
			return null;
		}
	}
	@Override
	public List<Student> getStudentDetailsByName(String studentName) 
	{
		return studentRepository.getDetailsBystudentName(studentName);
	}
	@Override
	public List<Student> findStudentPercentageGreaterThan(String percentage) 
	{
		return studentRepository.findBypercentageGreaterThan(percentage);
	}
}
