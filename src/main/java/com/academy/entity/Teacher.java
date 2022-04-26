package com.academy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

	
	@Id
	private String teacherName;
	
	
	private double teacherExperience;


	public Teacher(String teacherName, int teacherExperience) {
		super();
		this.teacherName = teacherName;
		this.teacherExperience = teacherExperience;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public double getTeacherExperience() {
		return teacherExperience;
	}


	public void setTeacherExperience(int teacherExperience) {
		this.teacherExperience = teacherExperience;
	}
	
	
}
