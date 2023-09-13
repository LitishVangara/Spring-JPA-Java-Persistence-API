package org.jsp.springJPA.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	private Integer rollNo;
	private String percentage;
	private String stream;
	private String studentName;
	public Student() {}
	public int getRollNo() 
	{
		return this.rollNo;
	}
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	public String getPercentage() 
	{
		return this.percentage;
	}
	public void setPercentage(String percentage) 
	{
		this.percentage = percentage;
	}
	public String getStream() 
	{
		return this.stream;
	}
	public void setStream(String stream) 
	{
		this.stream = stream;
	}
	public String getStudentName() 
	{
		return this.studentName;
	}
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", percentage=" + percentage + ", stream=" + stream + ", studentName="
				+ studentName + "]";
	}
}