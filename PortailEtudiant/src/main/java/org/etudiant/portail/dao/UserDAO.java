package org.etudiant.portail.dao;

import java.util.List;

import org.etudiant.portail.model.User;

public interface UserDAO {


	public void addUser( User u);
	public List< User>getAllUser();
	public void deleteUser(int id);
	public void updateUser(User u);
	public User getUserById(int id);

	
}
