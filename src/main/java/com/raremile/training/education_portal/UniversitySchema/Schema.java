package com.raremile.training.education_portal.UniversitySchema;

import com.raremile.training.education_portal.Course.*;
import com.raremile.training.education_portal.University.*;

public interface Schema {
	public void addNewLocation(String City);
	public void RemoveLocation(String LocationId);
	public void addNewScheme(String Name);
	public void RemoveScheme(String SchemeId);
	public void addNewDiscipline(String Name);
	public void RemoveDiscipline(String DisciplineId);
	public void addNewCourse(Course NewCourse);
	public void removeCourse(Course CourseId);
	public void appendCourseList(String SchemeId,String DisciplineId);
	public void ShowCourseList(String SchemeId,String DisciplineId);
	public void SkewCourseList(String SchemeId,String DisciplineId);
	public void generateAcademicOutcome(University Performance,int year, String CourseId);
}