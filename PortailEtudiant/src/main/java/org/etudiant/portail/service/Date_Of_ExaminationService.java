package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.model.Date_Of_Examination;

public interface Date_Of_ExaminationService {
	
	public Date_Of_Examination  addDate_Of_Examination(String room ,  String date , String time , String module);
	public List<Date_Of_Examination>getAllDate_Of_Examination();
	public int deleteDate_Of_Examination(String room);
	public Date_Of_Examination updateDate_Of_Examination(String room ,  String date , String time , String module);
	public Date_Of_Examination getDate_Of_ExaminationById(String room);
	

}
