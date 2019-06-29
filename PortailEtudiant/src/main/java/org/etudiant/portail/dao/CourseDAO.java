package org.etudiant.portail.dao;
import org.etudiant.portail.model.Course;

 
public interface CourseDAO {
	
	public void addCourse(Course c);
	//public List<course>getAllcourse();
	public void deletecourse(String type);
	public void updatecourse(Course c);
	public Course getcourseBytype(String type);
	
}
