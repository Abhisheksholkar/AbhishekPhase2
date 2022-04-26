package com.academy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subjects {
	@Id
private String subjectName;
private String subjectlevel;
private int sumbjectMaxMarks;

Subjects()
{
	
}

public Subjects(String subjectName, String subjectlevel, int sumbjectMaxMarks) {
	super();
	this.subjectName = subjectName;
	this.subjectlevel = subjectlevel;
	this.sumbjectMaxMarks = sumbjectMaxMarks;
}

public String getSubjectName() {
	return subjectName;
}

public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}

public String getSubjectlevel() {
	return subjectlevel;
}

public void setSubjectlevel(String subjectlevel) {
	this.subjectlevel = subjectlevel;
}

public int getSumbjectMaxMarks() {
	return sumbjectMaxMarks;
}

public void setSumbjectMaxMarks(int sumbjectMaxMarks) {
	this.sumbjectMaxMarks = sumbjectMaxMarks;
}

}
