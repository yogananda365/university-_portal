package com.raremile.training.education_portal.University;

import com.raremile.training.education_portal.Course.Course;
import com.raremile.training.education_portal.Student.Student;

public class UniversityImpl implements University {
	
	private String UniversityId;
	private String UniversityType;
	private String UniversityName;
	private String Address;
	private String DisciplineList;
	private String SchemaFollowed;

	public void LoadUniversityDetails(String UniversityId) {
		// TODO Auto-generated method stub

	}

	public void showAcademicOutcome(int year) {
		// TODO Auto-generated method stub

	}

	public void showEnlistedStudents() {
		// TODO Auto-generated method stub

	}

	public void Enroll(Student enrollee, Course Preferred) {
		// TODO Auto-generated method stub

	}

	public void Terminate(Student enrollee, Course Preferred) {
		// TODO Auto-generated method stub

	}

	public String getUniversityId() {
		return this.UniversityId;
	}

	public void setUniversityId(String universityId) {
		this.UniversityId = universityId;
	}

	public String getUniversityType() {
		return this.UniversityType;
	}

	public void setUniversityType(String universityType) {
		this.UniversityType = universityType;
	}

	public String getUniversityName() {
		return this.UniversityName;
	}

	public void setUniversityName(String universityName) {
		this.UniversityName = universityName;
	}

	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getDisciplineList() {
		return this.DisciplineList;
	}

	public void setDisciplineList(String disciplineList) {
		this.DisciplineList = disciplineList;
	}

	public String getSchemaFollowed() {
		return this.SchemaFollowed;
	}

	public void setSchemaFollowed(String schemaFollowed) {
		this.SchemaFollowed = schemaFollowed;
	}

}
