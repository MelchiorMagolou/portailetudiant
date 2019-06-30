package org.etudiant.portail.dao;

import java.util.List;

import org.etudiant.portail.model.Course;

public interface CourseDAO {
	
	public void addCourse(Course c);
	public List<Course>getAllCourse();
	public void deleteCourse(int id);
	public void updateCourse(Course c);
	public Course getCourseBymodule(String module);

}
