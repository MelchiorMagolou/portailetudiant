package org.etudiant.portail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.etudiant.portail.model.Notes_Average;


public class NotesDAOimpl implements  NotesDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	public NotesDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addnotes(Notes_Average  n) {
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();
		
	}
	@Override
	public void updatenotes(Notes_Average n) {
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();
		
	}
	@Override
	public Notes_Average  getnotesById(int id) {
		return em.find(Notes_Average .class, id);
	}
	@Override
	public Notes_Average getnotesBymodule(String module) {
		return em.find(Notes_Average .class, module);
	}
}
