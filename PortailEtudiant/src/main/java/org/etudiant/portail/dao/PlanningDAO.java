package org.etudiant.portail.dao;

import java.util.List;

import org.etudiant.portail.model.*;
public interface PlanningDAO {
	public void addPlanning( Planning l);
	public List< Planning>getAllPlanning();
	public void deletePlanning(int id);
	public void updatePlanning( Planning l);
	public  Planning getPlanningById(int id);

}

