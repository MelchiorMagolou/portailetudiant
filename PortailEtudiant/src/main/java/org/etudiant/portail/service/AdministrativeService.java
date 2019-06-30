package org.etudiant.portail.service;


import org.etudiant.portail.model.Administrative;
import java.util.List;


public interface AdministrativeService {
	
	public Administrative addAdministrative(String cin , String name , String first_name , String email ,String role);
    public List<Administrative>getAllAdministrative();
	public int deleteAdministrative(String cin);
	public Administrative updateAdministrative(String cin , String name , String first_name , String email ,String role);
	public Administrative getAdministrativeById(String cin);
	

}
