package org.etudiant.portail.dao;
import org.etudiant.portail.model.*;

 
public interface ProfessorDAO {
	public void addprofessor(Professor p);
	public void deletprofessor(int id);
	public void updateprofessor(Professor p);
	public Professor getprofessorById(int id);

}
