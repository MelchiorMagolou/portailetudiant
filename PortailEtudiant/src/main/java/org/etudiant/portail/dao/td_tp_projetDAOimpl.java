package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.Course;
import org.etudiant.portail.model.TD_TP_Projet;



public class td_tp_projetDAOimpl implements td_tp_projetDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	public td_tp_projetDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}
	@Override
	public void addTD_TP_Projet(TD_TP_Projet ttp) {
		em.getTransaction().begin();
		em.persist(ttp);
		em.getTransaction().commit();
	}

	@Override
	public List<TD_TP_Projet>  getAllTD_TP_Projet() {
		Query q = em.createQuery("select ttp from TD_TP_Projet as ttp");
		return (List) q.getResultList();
	}

	@Override
	public void updateTD_TP_Projet(TD_TP_Projet ttp) {
		em.getTransaction().begin();
		em.persist(ttp);
		em.getTransaction().commit();
	}

	@Override
	public TD_TP_Projet getTD_TP_ProjetById(int id) {
		return em.find(TD_TP_Projet.class, id);
	}

 

}
