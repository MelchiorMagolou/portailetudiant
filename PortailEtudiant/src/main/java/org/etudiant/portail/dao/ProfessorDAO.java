package org.etudiant.portail.dao;
import org.etudiant.portail.model.professor;

 
public interface ProfessorDAO {
	public void addprofessor(professor p);
	public void deletprofessor(int id);
	public void updateprofessor(professor p);
	public professor getprofessorById(int id);

}
