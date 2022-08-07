package com.example.demo.Service;

import java.util.List;
	

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;


public class StudentServiceImpl implements StudentServiceI {
	@Autowired
private StudentRepository studentRepository;
//	}
//
//	@Override
//	public List<Student> getAllStudent() {
//		List<Student> findAll = studentRepository.findAll();
//		return findAll;
//	}
//
//	@Override
//	public Student getStudentById(Integer id) {
//		Student student = studentRepository.findById(id).get();
//		return student;
//	}

	@Override
	public Integer addStudent1(Student student) {
		Student save = studentRepository.save(student);
		return save.getStudentid();
	}

	@Override
	public List<Student> getAllStudent1() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public int addStudent(Student student) {
		Student save = studentRepository.save(student);
		return save.getStudentid();
	}

	@Override
	public Student getStudentById(Integer id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}
}
