package org.etudiant.portail.dao;
import org.etudiant.portail.model.course;

 
public interface CourseDAO {
	
	public void addCourse(course c);
	//public List<course>getAllcourse();
	public void deletecourse(String type);
	public void updatecourse(course c);
	public course getcourseBytype(String type);
	
}
