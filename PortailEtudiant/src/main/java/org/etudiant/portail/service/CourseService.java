package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.CourseDAO;
import org.etudiant.portail.model.Course;


public interface CourseService {
	
	
  public Course addCourse(String  title , String name_prof , String module , String spinneret , byte[] file );
  public int deletecourse(String title ,String name_prof , String module );	
  public Course updatecourse(String  title , String name_prof , String module , String spinneret , byte[] file );	
  public Course getcourseBytype( String title ,String name_prof , String module );
  public List<Course>getAllCourse();
  
  

}
