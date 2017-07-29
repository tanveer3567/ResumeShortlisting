package com.struts.model;

public class StudentExperience {

	private Student Intstudent;
	private Experience Intexperience;
	
	public StudentExperience() {
	}
	
	public StudentExperience(Student intstudent, Experience intexperience) {
		super();
		Intstudent = intstudent;
		Intexperience = intexperience;
	}
	
	public Student getIntstudent() {
		return Intstudent;
	}
	
	public void setIntstudent(Student intstudent) {
		Intstudent = intstudent;
	}
	public Experience getIntexperience() {
		return Intexperience;
	}
	public void setIntexperience(Experience intexperience) {
		Intexperience = intexperience;
	}
	
}
