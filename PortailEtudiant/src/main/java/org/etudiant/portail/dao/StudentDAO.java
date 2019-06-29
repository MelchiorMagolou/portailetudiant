package org.etudiant.portail.dao;
import java.util.List;
import org.etudiant.portail.model.student;; 
public interface StudentDAO {
	public void addstudent(student e);
	public List<student> getAllstudent();
	public void deletestudent(int id);
	public void updatestudent(student e);
	public student getstudentById(int id);

}
