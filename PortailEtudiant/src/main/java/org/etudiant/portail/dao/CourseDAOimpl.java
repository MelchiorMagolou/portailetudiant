package org.etudiant.portail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.etudiant.portail.model.course;
import org.etudiant.portail.model.professor;
 

public class CourseDAOimpl implements CourseDAO {
	private EntityManagerFactory factory;
	private EntityManager em;
	public CourseDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addCourse(course c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}

	@Override
	public void deletecourse(String type) {
		em.getTransaction().begin();
		em.remove(em.find(course.class, type));
		em.getTransaction().commit();
	}

	@Override
	public void updatecourse(course c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public course getcourseBytype(String type) {
		return em.find(course.class, type);
	}

}
