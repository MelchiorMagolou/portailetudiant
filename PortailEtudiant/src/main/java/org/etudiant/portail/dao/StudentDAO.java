package org.etudiant.portail.dao;
import java.util.List;
import org.etudiant.portail.model.Student;; 
public interface StudentDAO {
	public void addstudent(Student e);
	public List<Student> getAllstudent();
	public void deletestudent(int id);
	public void updatestudent(Student e);
	public Student getstudentById(int id);

}
