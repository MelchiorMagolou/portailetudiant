package org.etudiant.portail.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;
import org.etudiant.portail.model.student;
public class StudentDAOimpl implements StudentDAO {
	private EntityManagerFactory factory;
	private EntityManager em;
	public StudentDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	
	// private List<student> students = new ArrayList<student>();
	@Override
	public void addstudent(student e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}
	@Override
	public List<student> getAllstudent() {
		Query q = em.createQuery("select e from student as e");
		return q.getResultList();
	}
	@Override
	public void deletestudent(int id) {
		em.getTransaction().begin();
		em.remove(em.find(student.class, id));
		em.getTransaction().commit();
	}
	@Override
	public void updatestudent(student e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}
	@Override
	public student getstudentById(int id) {
		return em.find(student.class, id);
	}

}
