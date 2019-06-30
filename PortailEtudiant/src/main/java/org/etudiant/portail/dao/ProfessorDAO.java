package org.etudiant.portail.dao;
import java.util.List;

import org.etudiant.portail.model.*;

 
public interface ProfessorDAO {
	public void addProfessor(Professor p);
	public void deletProfessor(String cin);
	public void updateProfessor(Professor p);
	public Professor getProfessorById(String cin);
	public List<Professor>getAllProfessor();

}
