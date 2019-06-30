package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.CourseDAO;
import org.etudiant.portail.dao.CourseDAOimpl;
import org.etudiant.portail.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CourseServiceImp implements CourseService {

	@Autowired
	private CourseDAO course ;
	
	@Override
	public Course addCourse(String title, String name_prof, String module, String spinneret, byte[] file) {
		
		Course c = new Course ();
		
		c.setTitle(title);
		c.setName_prof(name_prof);
		c.setModule(module);
		c.setSpinneret(spinneret);
		c.setFile(file);
		
		course.addCourse(c);
		
		return c;
		
	}

	@Override
	public int deletecourse(String title, String name_prof, String module) {
		
		Course c = getcourseBytype(title,name_prof,module);
		
		int id = c.getId_doc();
		
		if(c!=null){
			
			      course.deleteCourse(id); 
			      return 1;
		}
		else {
			    
			 System.out.println("impossible de supprimer le cours ");
			
			return 0;
		}
	}

	@Override
	public Course updatecourse(String title, String name_prof, String module, String spinneret, byte[] file) {
		
        Course c = getcourseBytype(title,name_prof,module);
		
		if(c!=null){
			
			   c.setTitle(title);
			   c.setName_prof(name_prof);
			   c.setModule(module);
			   c.setSpinneret(spinneret);
			   c.setFile(file);				
			   course.updateCourse(c);	
	  
		}
		else {
			    
			 System.out.println("impossible de modifier le cours , il n'existe pas");
		}
		
		return c ;
		
	}

	@Override
	public Course getcourseBytype(String title, String name_prof, String module) {
				
		   Course c=  course.getCourseBymodule(module);	
		   
		   return c;
		   
	}
	

	public List<Course>getAllCourse(){
		
		List<Course> list = course.getAllCourse();
		
		return list;
	}
	

	public void setCourse(CourseDAO course) {
		this.course = course;
	}

}
