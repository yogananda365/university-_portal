package com.raremile.training.education_portal.Course;

import com.raremile.training.education_portal.Student.*;

public interface Course {
	public void LoadCourseDetails(String CourseId);
	public void IsEligible(Student Profile);
}
