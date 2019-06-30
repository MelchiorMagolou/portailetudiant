package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.*;
import org.etudiant.portail.model.Course;

public class CourseDAOimpl implements CourseDAO{

	private EntityManagerFactory factory;
	private EntityManager em;
	public CourseDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addCourse(Course c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}

	@Override
	public void deleteCourse(int id) {
		em.getTransaction().begin();
		em.remove(em.find(Course.class, id));
		em.getTransaction().commit();
	}

	@Override
	public void updateCourse(Course c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public Course getCourseBymodule(String module) {
		return em.find(Course.class, module);
	}
	@Override
	public List<Course> getAllCourse() {
		Query q = em.createQuery("select c from Course as c");
		return q.getResultList();
	}

}
