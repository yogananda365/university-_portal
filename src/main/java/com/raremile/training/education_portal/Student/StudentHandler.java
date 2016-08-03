package com.raremile.training.education_portal.Student;

public interface StudentHandler {
	public void addStudent(String UniversitySeatNumber);
	public StudentImpl getStudent(String UniversitySeatNumber);
}