package org.etudiant.portail.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.etudiant.portail.model.notes;

public class NotesDAOimpl implements  NotesDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	public NotesDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addnotes(notes n) {
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();
		
	}
	@Override
	public void updatenotes(notes n) {
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();
		
	}
	@Override
	public notes getnotesById(int id) {
		return em.find(notes.class, id);
	}
	@Override
	public notes getnotesBymodule(String module) {
		return em.find(notes.class, module);
	}
}
