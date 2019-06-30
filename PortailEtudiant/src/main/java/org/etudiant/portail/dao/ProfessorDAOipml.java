package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.Professor;

public class ProfessorDAOipml implements ProfessorDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	public ProfessorDAOipml() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addProfessor(Professor p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public void deletProfessor(String cin) {
		em.getTransaction().begin();
		em.remove(em.find(Professor.class,cin));
		em.getTransaction().commit();
		
	}

	@Override
	public void updateProfessor(Professor p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public Professor getProfessorById(String cin) {

		return em.find(Professor.class,cin);
	}
	@Override
	public List<Professor> getAllProfessor() {
		Query q = em.createQuery("select p from Professor as p");
		return q.getResultList();
	}

}
