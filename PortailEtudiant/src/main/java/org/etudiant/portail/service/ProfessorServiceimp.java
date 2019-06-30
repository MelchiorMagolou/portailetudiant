package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.ProfessorDAO;
import org.etudiant.portail.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ProfessorServiceimp implements ProfessorService {
	
	@Autowired
	private ProfessorDAO prof;

	@Override
	public Professor addProfessor(String cin_prof, String name_prof, String first_name_prof, String email_prof,
			String address_prof, String department) {
		
		Professor p= new Professor();
		p.setAddress_prof(address_prof);
		p.setCin_prof(cin_prof);
		p.setDepartment(department);
		p.setEmail_prof(email_prof);
		p.setFirst_name_prof(first_name_prof);
		p.setName_prof(name_prof);
		
		prof.addProfessor(p);
		
		return p;
	}

	@Override
	public int deletProfessor(String cin) {
		
		Professor p = getProfessorById(cin);
		
		if(p!=null) {
			
			prof.deletProfessor(cin);
			return 1;
		}
		else return 0;
		
	}

	@Override
	public Professor updateProfessor(String cin_prof, String name_prof, String first_name_prof, String email_prof,
			String address_prof, String department) {
		
		Professor p = getProfessorById(cin_prof);
		
		p.setAddress_prof(address_prof);
		p.setCin_prof(cin_prof);
		p.setDepartment(department);
		p.setEmail_prof(email_prof);
		p.setFirst_name_prof(first_name_prof);
		p.setName_prof(name_prof);
		
		prof.updateProfessor(p);
		return p;
	}

	@Override
	public Professor getProfessorById(String cin) {
		
		Professor p = prof.getProfessorById(cin);
		return p;
	}

	@Override
	public List<Professor> getAllProfessor() {
		 
		List<Professor> list = prof.getAllProfessor();
		
		return list;
	}

}
