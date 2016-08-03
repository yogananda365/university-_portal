package com.raremile.training.education_portal.Grader;

import com.raremile.training.education_portal.Course.*;
import com.raremile.training.education_portal.Student.*;

public interface Grader {
	public void ShowMarksInPercentage(Student Enrollee,Course Enrolled);
	public void ShowMarksInGrade(Student Enrollee,Course Enrolled);
	public void showResults(Student Enrollee,Course Enrolled);
}
