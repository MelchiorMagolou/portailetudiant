package org.etudiant.portail.dao;
import java.util.List;
import org.etudiant.portail.model.Student;; 
public interface StudentDAO {
	public void addStudent(Student e);
	public List<Student> getAllStudent();
	public void deleteStudent(String id);
	public void updateStudent(Student e);
	public Student getStudentById(String id);

}
