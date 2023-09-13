package org.jsp.springJPA.repository;

import java.util.List;

import org.jsp.springJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//For the Interface Implementation Classes hidden - Abstraction
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	//Customize
	List<Student> getDetailsBystudentName(String studentName);
	//Customize
	List<Student> findBypercentageGreaterThan(String percentage);
}
