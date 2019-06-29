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
	public void addstudent(Student e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}
	@Override
	public List<Student> getAllstudent() {
		Query q = em.createQuery("select e from student as e");
		return q.getResultList();
	}
	@Override
	public void deletestudent(int id) {
		em.getTransaction().begin();
		em.remove(em.find(Student.class, id));
		em.getTransaction().commit();
	}
	@Override
	public void updatestudent(Student e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}
	@Override
	public Student getstudentById(int id) {
		return em.find(Student.class, id);
	}

}
