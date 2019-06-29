package org.etudiant.portail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.etudiant.portail.model.professor;

public class ProfessorDAOipml implements ProfessorDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	public ProfessorDAOipml() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addprofessor(professor p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public void deletprofessor(int id) {
		em.getTransaction().begin();
		em.remove(em.find(professor.class, id));
		em.getTransaction().commit();
		
	}

	@Override
	public void updateprofessor(professor p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public professor getprofessorById(int id) {

		return em.find(professor.class, id);
	}

}
