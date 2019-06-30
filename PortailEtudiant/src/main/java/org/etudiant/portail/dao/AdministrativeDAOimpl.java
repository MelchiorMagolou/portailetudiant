package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.Administrative;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdministrativeDAOimpl implements AdministrativeDAO {

	private EntityManagerFactory factory;
	private EntityManager em;
	
	public AdministrativeDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}

	@Override
	public void addAdministrative(Administrative a) {
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
	}

	@Override
	public void deleteAdministrative(String cin) {
		em.getTransaction().begin();
		em.remove(em.find(Administrative.class, cin));
		em.getTransaction().commit();
		
	}

	@Override
	public void updateAdministrative(Administrative a) {
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
	}

	@Override
	public Administrative getAdministrativeById(String cin) {
		return em.find(Administrative.class, cin);	}

	@Override
	public List<Administrative> getAllAdministrative() {
		Query q = em.createQuery("select a from Administrative as a");
		return q.getResultList();
	}
}
