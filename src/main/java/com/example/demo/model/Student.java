package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int studentid;
private String studentname;
private String studentemail;
private int studentage;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentemail() {
	return studentemail;
}
public void setStudentemail(String studentemail) {
	this.studentemail = studentemail;
}
public int getStudentage() {
	return studentage;
}
public void setStudentage(int studentage) {
	this.studentage = studentage;
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentemail=" + studentemail
			+ ", studentage=" + studentage + "]";
}

}
