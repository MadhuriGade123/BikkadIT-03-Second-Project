package com.example.demo.Service;

import java.util.List;
<<<<<<< HEAD
=======

import com.example.demo.model.Student;

public class StudentServiceImpl implements StudentServiceI{

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById() {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> fbed30fc2e0f6d71f0cb556b4d979924e5924c70

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

public class StudentServiceImpl implements StudentServiceI {
	@Autowired
private StudentRepository studentRepository;
	
	@Override
	public Integer addStudent(Student student) {
		Student save = studentRepository.save(student);
		return save.getStudentid();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public Student getStudentById(Integer id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}
}
