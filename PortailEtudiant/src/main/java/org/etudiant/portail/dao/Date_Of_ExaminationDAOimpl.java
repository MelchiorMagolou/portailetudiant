package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.Date_Of_Examination;

public class Date_Of_ExaminationDAOimpl implements Date_Of_ExaminationDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public Date_Of_ExaminationDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}

	@Override
	public void addDate_Of_Examination(Date_Of_Examination dt) {
		em.getTransaction().begin();
		em.persist(dt);
		em.getTransaction().commit();
	}

	@Override
	public List<Date_Of_Examination> getAllDate_Of_Examination() {
		Query q = em.createQuery("select dt from Date_Of_Examination as dt");
		return q.getResultList();
	}

	@Override
	public void deleteDate_Of_Examination(int id) {
		em.getTransaction().begin();
		em.remove(em.find(Date_Of_Examination.class, id));
		em.getTransaction().commit();
	}

	@Override
	public void updateDate_Of_Examination(Date_Of_Examination dt) {
		em.getTransaction().begin();
		em.persist(dt);
		em.getTransaction().commit();
		
	}

	@Override
	public Date_Of_Examination getDate_Of_ExaminationById(int id) {
		return em.find(Date_Of_Examination.class, id);
	}
	
}
