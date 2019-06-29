package org.etudiant.portail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.etudiant.portail.model.*;
 

public class CourseDAOimpl implements CourseDAO {
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
	public void deletecourse(String type) {
		em.getTransaction().begin();
		em.remove(em.find(Course.class, type));
		em.getTransaction().commit();
	}

	@Override
	public void updatecourse(Course c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public Course getcourseBytype(String type) {
		return em.find(Course.class, type);
	}

}
