package com.raremile.training.education_portal.Course;

import com.raremile.training.education_portal.Student.*;

public class CourseImpl implements Course {

	private String CourseId;
	private String CourseType;
	private String CourseName;
	private String UnitList;
	private CourseHandler handler;

	public void LoadCourseDetails(String CourseId) {
		CourseImpl obtained = handler.getCourse(CourseId);
		CourseId = obtained.getCourseId();
		CourseType = obtained.getCourseType();
		CourseName = obtained.getCourseName();
		UnitList = obtained.getUnitList();
	}

	public void IsEligible(Student Profile) {
		// TODO Auto-generated method stub

	}

	public String getCourseId() {
		return this.CourseId;
	}

	public void setCourseId(String courseId) {
		this.CourseId = courseId;
	}

	public String getCourseType() {
		return this.CourseType;
	}

	public void setCourseType(String courseType) {
		this.CourseType = courseType;
	}

	public String getCourseName() {
		return this.CourseName;
	}

	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}

	public String getUnitList() {
		return this.UnitList;
	}

	public void setUnitList(String unitList) {
		this.UnitList = unitList;
	}

	public CourseHandler getHandler() {
		return handler;
	}

	public void setHandler(CourseHandler handler) {
		this.handler = handler;
	}
}
