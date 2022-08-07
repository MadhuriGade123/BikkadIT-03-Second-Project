package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentServiceI {

 public Integer addStudent1(Student student);
 
 public List<Student>getAllStudent1();
 
 public Student getStudentById(Integer id);



	public int addStudent(Student student);
	public List<Student>getAllStudent();
	public Student getStudentById();


}
