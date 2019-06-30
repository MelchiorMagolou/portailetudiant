package org.etudiant.portail.dao;

import java.util.List;

import org.etudiant.portail.model.Date_Of_Examination;

public interface Date_Of_ExaminationDAO {
	
	
	public void addDate_Of_Examination(Date_Of_Examination dt);
	public List<Date_Of_Examination>getAllDate_Of_Examination();
	public void deleteDate_Of_Examination(int id);
	public void updateDate_Of_Examination(Date_Of_Examination dt);
	public Date_Of_Examination getDate_Of_ExaminationById(int id);
	

}
