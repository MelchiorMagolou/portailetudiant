package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.Planning;

public class PlanningDAOimpl implements PlanningDAO {
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public PlanningDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}

	@Override
	public void addPlanning(Planning l) {
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
	}

	@Override
	public List<Planning> getAllPlanning() {
		Query q = em.createQuery("select l from Planning as l");
		return q.getResultList();
	}

	@Override
	public void deletePlanning(int id) {
		em.getTransaction().begin();
		em.remove(em.find(Planning.class, id));
		em.getTransaction().commit();
		
	}

	@Override
	public void updatePlanning(Planning l) {
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		
	}

	@Override
	public Planning getPlanningById(int id) {
		return em.find(Planning.class, id);
	}

}
