package com.academy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classes {
	
	@Id
	private int ClassNumber;
	
	private int classCapacity;

	public Classes(int classnumber, int classCapacity) {
		super();
		this.ClassNumber = classnumber;
		this.classCapacity = classCapacity;
	}

	public int getClassNo() {
		return ClassNumber;
	}

	public void setClassNo(int classNumber) {
		ClassNumber = classNumber;
	}

	public int getClassCapacity() {
		return classCapacity;
	}

	public void setClassCapacity(int classCapacity) {
		this.classCapacity = classCapacity;
	}

}
