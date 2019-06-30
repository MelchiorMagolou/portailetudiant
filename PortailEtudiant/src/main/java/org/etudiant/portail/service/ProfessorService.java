package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.model.Professor;

public interface ProfessorService {

	public Professor addProfessor(String cin_prof ,String name_prof,String first_name_prof ,String email_prof ,String address_prof ,String department);
	public int deletProfessor(String cin);
	public Professor updateProfessor(String cin_prof ,String name_prof,String first_name_prof ,String email_prof ,String address_prof ,String department);
	public Professor getProfessorById(String cin);
	public List<Professor>getAllProfessor();

	
}
