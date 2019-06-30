package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.UserDAO;
import org.etudiant.portail.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceimpl implements UserService {
	
	@Autowired
	private UserDAO user ;

	@Override
	public User addUser(String id_user, String user_name, String password, String role) {
		
		User u = new User();
		
		int id = Integer.valueOf(id_user);
		
		u.setId_user(id);
		u.setPassword(password);
		u.setRole(role);
		u.setUser_name(user_name);
		
		user.addUser(u);
		
		return u;
	}

	@Override
	public List<User> getAllUser() {
		
		List<User> li = user.getAllUser();
		
		return li;
	}

	@Override
	public void deleteUser(String id) {
		
		User u = getUserById(id);
		int idd = Integer.valueOf(id);
        if(u!=null) {
        	
        	user.deleteUser(idd);
        	
        }
		
		
	}

	@Override
	public User updateUser(String id_user, String user_name, String password, String role) {
		
		User u = getUserById(id_user);
		
		if(u!=null) {
			
			int id = Integer.valueOf(id_user);
			
			u.setId_user(id);
			u.setPassword(password);
			u.setRole(role);
			u.setUser_name(user_name);
			
			user.updateUser(u);				
		}
		
		
		return u;
	}

	@Override
	public User getUserById(String id) {
		
		int idd = Integer.valueOf(id);
		User u = user.getUserById(idd);
		
		return u;
	}

}
