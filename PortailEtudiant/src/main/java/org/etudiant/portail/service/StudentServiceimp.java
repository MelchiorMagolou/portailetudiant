package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.ProfessorDAO;
import org.etudiant.portail.dao.StudentDAO;
import org.etudiant.portail.model.Notes_Average;
import org.etudiant.portail.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceimp implements StudentService {

	@Autowired
	private StudentDAO std;
	
	@Override
	public Student addStudent(String cin_std, String cne_std, String name_std, String first_name_std, String birth_date,
			String email_std, String address_std, String spinneret, String University_level,
			List<Notes_Average> notes) {
		
		Student e = new Student();
		
		e.setAddress_std(address_std);
        e.setBirth_date(birth_date);
        e.setCin_std(cin_std);
        e.setCne_std(cne_std);
        e.setEmail_std(email_std);
        e.setFirst_name_std(first_name_std);
        e.setName_std(first_name_std);
        e.setSpinneret(spinneret);
        e.setUniversity_level(University_level);
        e.setNotes(notes);
        
        std.addStudent(e);
        
		return e;
        
        
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> e = std.getAllStudent();
		
		return e;
	}

	@Override
	public void deleteStudent(String id) {
		
		Student e =  getStudentById(id);
		if(e!=null) {
			 
			std.deleteStudent(id);
			
		}

	}

	@Override
	public Student updateStudent(String cin_std, String cne_std, String name_std, String first_name_std, String birth_date,
			String email_std, String address_std, String spinneret, String University_level,
			List<Notes_Average> notes) {
		
		Student e =  getStudentById(cin_std);
		
		if(e!=null) {
		e.setAddress_std(address_std);
        e.setBirth_date(birth_date);
        e.setCin_std(cin_std);
        e.setCne_std(cne_std);
        e.setEmail_std(email_std);
        e.setFirst_name_std(first_name_std);
        e.setName_std(first_name_std);
        e.setSpinneret(spinneret);
        e.setUniversity_level(University_level);
        e.setNotes(notes);
        
        std.updateStudent(e);
		}
		
		return e;

	}

	@Override
	public Student getStudentById(String id) {
		
		 Student e = std.getStudentById(id);
		
		return e ;
	}

}
