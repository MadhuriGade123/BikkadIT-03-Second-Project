package com.example.demo.Service;

import java.util.List;

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
