package com.raremile.training.education_portal.University;

import com.raremile.training.education_portal.Course.*;
import com.raremile.training.education_portal.Student.*;

public interface University {
	public void LoadUniversityDetails(String UniversityId);
	public void showAcademicOutcome(int year);
	public void showEnlistedStudents();
	public void Enroll(Student enrollee,Course Preferred);
	public void Terminate(Student enrollee,Course Preferred);
}
