package com.academy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {

	
	private String studentFirstName;
	
	private String studentLastName;
	
	@Id
	private int studentRollNumber;
	
	private String classNumber;

	
	public Students() {
		
	}
	
	public Students(String studentFirstName, String studentLastName, int studentRollNumber, String classNumber) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentRollNumber = studentRollNumber;
		this.classNumber = classNumber;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	
}
