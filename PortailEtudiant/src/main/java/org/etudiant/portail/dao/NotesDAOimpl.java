package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.Notes_Average;


public class NotesDAOimpl implements  NotesDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	public NotesDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addNotes_Average(Notes_Average  n) {
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();
		
	}
	@Override
	public void updateNotes_Average(Notes_Average n) {
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();
		
	}
	@Override
	public Notes_Average  getNotes_AverageById(int id) {
		return em.find(Notes_Average .class, id);
	}
	@Override
	public Notes_Average getNotes_AverageBymodule(String module) {
		return em.find(Notes_Average .class, module);
	}
	@Override
	public List<Notes_Average> getAllNotes_Average() {
		Query q = em.createQuery("select n from Notes_Average as n");
		return q.getResultList();
	}
}
