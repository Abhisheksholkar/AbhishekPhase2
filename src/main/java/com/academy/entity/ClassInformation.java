package com.academy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClassInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slno;
	
	private String classnumber;
	
	private String teacher;
	
	private String subject;

	
	public ClassInformation()
	{
		
	}
	public ClassInformation(String classnumber, String teacher, String subject) {
		super();
		this.classnumber = classnumber;
		this.teacher = teacher;
		this.subject = subject;
	}

	public String getClassnumber() {
		return classnumber;
	}

	public void setClassnumber(String classnumber) {
		this.classnumber = classnumber;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
