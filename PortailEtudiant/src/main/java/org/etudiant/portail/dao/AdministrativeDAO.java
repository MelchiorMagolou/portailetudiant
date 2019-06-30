package org.etudiant.portail.dao;

import java.util.List;

import org.etudiant.portail.model.Administrative;

public interface AdministrativeDAO {
	
	
	public void addAdministrative(Administrative a);
    public List<Administrative>getAllAdministrative();
	public void deleteAdministrative(String cin);
	public void updateAdministrative(Administrative a);
	public Administrative getAdministrativeById(String cin);
	

}
