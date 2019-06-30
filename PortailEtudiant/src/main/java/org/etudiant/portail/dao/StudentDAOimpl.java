package org.etudiant.portail.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;
import org.etudiant.portail.model.Student;
public class StudentDAOimpl implements StudentDAO {
	private EntityManagerFactory factory;
	private EntityManager em;
	public StudentDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	
	// private List<student> students = new ArrayList<student>();
	@Override
	public void addStudent(Student e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}
	@Override
	public List<Student> getAllStudent() {
		Query q = em.createQuery("select s from Student as s");
		return q.getResultList();
	}
	@Override
	public void deleteStudent(String id) {
		em.getTransaction().begin();
		em.remove(em.find(Student.class, id));
		em.getTransaction().commit();
	}
	@Override
	public void updateStudent(Student e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}
	@Override
	public Student getStudentById(String id) {
		return em.find(Student.class, id);
	}

}
