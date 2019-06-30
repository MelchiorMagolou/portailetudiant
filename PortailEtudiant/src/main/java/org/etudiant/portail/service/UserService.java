package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.model.User;

public interface UserService {
	
	public User addUser(String id_user,String user_name,String password,String role);
	public List< User>getAllUser();
	public void deleteUser(String id);
	public User updateUser(String id_user,String user_name,String password,String role);
	public User getUserById(String id);


}
