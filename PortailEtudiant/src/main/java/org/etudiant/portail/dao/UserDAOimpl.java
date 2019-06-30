package org.etudiant.portail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.etudiant.portail.model.User;

public class UserDAOimpl implements UserDAO{
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public UserDAOimpl() {
		factory= Persistence.createEntityManagerFactory("springpu");
		em= factory.createEntityManager();
	}

	@Override
	public void addUser(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}

	@Override
	public List<User> getAllUser() {
		Query q = em.createQuery("select u from user as u");
		return q.getResultList();
	}

	@Override
	public void deleteUser(int id) {
		em.getTransaction().begin();
		em.remove(em.find(User.class, id));
		em.getTransaction().commit();
	}

	@Override
	public void updateUser(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}

	@Override
	public User getUserById(int id) {
		return em.find(User.class, id);
	}
 

}
