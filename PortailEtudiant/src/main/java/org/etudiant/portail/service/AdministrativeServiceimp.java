package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.AdministrativeDAO;
import org.etudiant.portail.model.Administrative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdministrativeServiceimp implements AdministrativeService {

	@Autowired 
	private AdministrativeDAO admini ;
	
	@Override
	public Administrative addAdministrative(String cin , String name , String first_name , String email ,String role) {
		
		Administrative a = new Administrative();
		
		a.setCin(cin);
		a.setName(name);
		a.setFirst_name(first_name);
		a.setEmail(email);
		a.setRole(role);
		admini.addAdministrative(a);
		return a;
	}

	@Override
	public List<Administrative> getAllAdministrative() {
		List<Administrative> list_A= admini.getAllAdministrative();
		return list_A;
	}

	@Override
	public int deleteAdministrative(String cin) {
		
		Administrative a = getAdministrativeById(cin);	
		
		if(a != null ) {
			
			admini.deleteAdministrative(cin);
			return 1;
		}
		else return 0;
	
	}

	@Override
	public Administrative updateAdministrative(String cin , String name , String first_name , String email ,String role) {
		
        Administrative a = getAdministrativeById(cin);
		
		a.setCin(cin);
		a.setName(name);
		a.setFirst_name(first_name);
		a.setEmail(email);
		a.setRole(role);
		admini.updateAdministrative(a);
		
		return a;
				
	}

	@Override
	public Administrative getAdministrativeById(String cin) {
		
		Administrative a = admini.getAdministrativeById(cin);
		
		return a;
	}

}
