package org.etudiant.portail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.etudiant.portail.model.Professor;

public class ProfessorDAOipml implements ProfessorDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	public ProfessorDAOipml() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addprofessor(Professor p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public void deletprofessor(int id) {
		em.getTransaction().begin();
		em.remove(em.find(Professor.class, id));
		em.getTransaction().commit();
		
	}

	@Override
	public void updateprofessor(Professor p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public Professor getprofessorById(int id) {

		return em.find(Professor.class, id);
	}

}
