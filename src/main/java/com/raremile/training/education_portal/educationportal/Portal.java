package com.raremile.training.education_portal.educationportal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.raremile.training.education_portal.Course.*;
import com.raremile.training.education_portal.Student.*;
import com.raremile.training.education_portal.University.*;
import com.raremile.training.education_portal.UniversitySchema.*;

public class Portal {

	private static final Logger LOG = LoggerFactory.getLogger(Portal.class);
	
	static {
		LOG.info("Loading MySQL driver");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			LOG.error("Could not load the driver", e);
		}
	}

	public static void main(String[] args) {
		try {
			SchemaObj model = new SchemaObj();
			CourseImpl newCourse = new CourseImpl();
			model.addNewCourse(newCourse);
			UniversityImpl newUniversity = new UniversityImpl();
			UniversityHandlerImpl newUniversityhandler = new UniversityHandlerImpl();
			newUniversityhandler.addUniversity(newUniversity);
			StudentImpl newStudent = new StudentImpl();
			CourseHandlerImpl newCourseHandler = new CourseHandlerImpl();
			CourseImpl StudentChoice = newCourseHandler.getCourse("java");
			newUniversity.Enroll(newStudent, StudentChoice);
			StudentHandlerImpl newStudentHandler = new StudentHandlerImpl();
			StudentImpl obtained = newStudentHandler.getStudent("1BG12CS125");
			obtained.GenerateMarks(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
