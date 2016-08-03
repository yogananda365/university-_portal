package com.raremile.training.education_portal.Student;

public class StudentImpl implements Student {
	
	private String UniversityId;
	private String DisciplineId;
	private String CurrentCourse;
	private int YearOfJoining;
	private String PersonalDetails;
	

	
	public void LoadStudentDetails(String UniverstiySeatNumber) {
		// TODO Auto-generated method stub

	}

	public void belongsTo() {
		// TODO Auto-generated method stub

	}

	public void GenerateMarks(int OutOfHundred) {
		//generate marks
	}

	public void showPursuingCourse() {
		// TODO Auto-generated method stub

	}

	public String getUniversityId() {
		return this.UniversityId;
	}

	public void setUniversityId(String universityId) {
		this.UniversityId = universityId;
	}

	public String getDisciplineId() {
		return this.DisciplineId;
	}

	public void setDisciplineId(String disciplineId) {
		this.DisciplineId = disciplineId;
	}

	public String getCurrentCourse() {
		return this.CurrentCourse;
	}

	public void setCurrentCourse(String currentCourse) {
		this.CurrentCourse = currentCourse;
	}

	public int getYearOfJoining() {
		return this.YearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.YearOfJoining = yearOfJoining;
	}

	public String getPersonalDetails() {
		return this.PersonalDetails;
	}

	public void setPersonalDetails(String personalDetails) {
		this.PersonalDetails = personalDetails;
	}

}
