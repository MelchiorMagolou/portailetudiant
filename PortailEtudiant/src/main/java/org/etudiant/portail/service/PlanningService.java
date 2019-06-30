package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.model.Planning;
import org.etudiant.portail.model.Professor;

public interface PlanningService {
	
	public Planning addPlanning(String day , String time , String room , boolean td ,boolean tp ,boolean course ,boolean project , boolean exam,Professor prof,String module);
	public List<Planning>getAllPlanning();
	public void deletePlanning(String id_day);
	public Planning updatePlanning(String id_day,String day , String time , String room , boolean td ,boolean tp ,boolean course ,boolean project , boolean exam ,Professor prof,String module);
	public  Planning getPlanningById(String id_day);
}
