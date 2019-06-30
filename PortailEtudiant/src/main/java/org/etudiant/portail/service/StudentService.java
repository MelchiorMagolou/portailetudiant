package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.model.Notes_Average;
import org.etudiant.portail.model.Student;

public interface StudentService {
    
	public Student addStudent(String cin_std,String cne_std ,String name_std,String first_name_std,String birth_date,String email_std,String address_std,String spinneret,String University_level,List<Notes_Average> notes);
	public List<Student> getAllStudent();
	public void deleteStudent(String id);
	public Student updateStudent(String cin_std,String cne_std ,String name_std,String first_name_std,String birth_date,String email_std,String address_std,String spinneret,String University_level,List<Notes_Average> notes);
	public Student getStudentById(String id);
	
	
	
}
