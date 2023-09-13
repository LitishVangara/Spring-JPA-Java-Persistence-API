package org.jsp.springJPA;

import java.util.List;
import java.util.Scanner;

import org.jsp.springJPA.configuration.ApplicationConfiguration;
import org.jsp.springJPA.dao.StudentDAO;
import org.jsp.springJPA.dao.StudentDAOImp;
import org.jsp.springJPA.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        StudentDAO studentDAO = applicationContext.getBean(StudentDAOImp.class);
        Scanner scan = new Scanner(System.in);
        
//void addStudent(Student s1);
        /*System.out.println("Enter Student Roll Number : ");
        int roll = scan.nextInt();
        System.out.println("Enter Student Name : ");
        String name = scan.next();
        System.out.println("Enter Student Percentage : ");
        String percentage = scan.next();
        System.out.println("Enter Student Stream : ");
        String stream = scan.next();
        //Create Object of Student Class - To provide Data
        Student student = new Student();
        student.setRollNo(roll);
        student.setStudentName(name);
        student.setPercentage(percentage);
        student.setStream(stream);
        studentDAO.addStudent(student);
        System.out.println("Record Inserted...");*/
        
//int deleteStudent(int rollNo);
        /*System.out.println("Enter Student Roll Number : ");
        int roll = scan.nextInt();
        int record = studentDAO.deleteStudent(roll);
        if (record != 0) 
        {
        	System.out.println("Record Deleted...");
		}
        else
        {
        	System.out.println("No Record Found...");
        }*/
        
//Student getStudentDetails(int rollNo);
        /*System.out.println("Enter Student Roll Number : ");
        int roll = scan.nextInt();
        Student student2 = studentDAO.getStudentDetails(roll);
        if (student2 != null) 
        {
			System.out.println(student2);
		}
        else
        {
        	System.out.println("No Record Found...");
        }*/
        
//List<Student> getAllStudentDetails();
        //Display All Student Details
        /*List<Student> list = studentDAO.getAllStudentDetails();
        if (list.size() != 0) 
        {
			for (Student student3 : list) 
			{
				System.out.println(student3);
			}
		}
        else
        {
        	System.out.println("No Records Found...");
        }*/
        
//Student updatePercentage(int rollNo, String percentage);
        /*System.out.println("Enter Student Roll Number : ");
        int roll = scan.nextInt();
        System.out.println("Enter Student Percentage : ");
        String percentage = scan.next();
        Student student4 = studentDAO.updatePercentage(roll, percentage);
        if (student4 != null) 
        {
        	System.out.println("Updated...");
		}
        else
        {
        	System.out.println("Invalid Roll Number...");
        }*/
        
//List<Student> getStudentDetailsByName(String studentName);
        /*System.out.println("Enter Student Name : ");
        String name = scan.next();
        List<Student> list2 = studentDAO.getStudentDetailsByName(name);
        if (list2.size() > 0) 
        {
        	for (Student student5 : list2) 
        	{
        		System.out.println(student5);
			}
		}
        else
        {
        	System.out.println("No Record Found...");
        }*/
        
//List<Student> findByPercentageGreaterThan(String percentage);
        System.out.println("Enter Student Percentage : ");
        String percentage = scan.next();
        List<Student> list3 = studentDAO.findStudentPercentageGreaterThan(percentage);
        if (list3.size() != 0) 
        {
        	for (Student student6 : list3) 
        	{
        		System.out.println(student6);
			}
		}
        else
        {
        	System.out.println("Enter Valid Percentage...");
        }
    }
}
