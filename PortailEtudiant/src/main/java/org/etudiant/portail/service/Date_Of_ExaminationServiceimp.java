package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.Date_Of_ExaminationDAO;
import org.etudiant.portail.model.Date_Of_Examination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Date_Of_ExaminationServiceimp implements Date_Of_ExaminationService {

	@Autowired
	private Date_Of_ExaminationDAO  examen ;
	
	
	@Override
	public Date_Of_Examination addDate_Of_Examination(String room, String date, String time, String module) {
		
		Date_Of_Examination e = new Date_Of_Examination();
		int rom = Integer.valueOf(room);
		e.setRoom(rom);
		e.setDate(date);
		e.setModule(module);
		e.setTime(time);
		
		examen.addDate_Of_Examination(e);
		
		return e;
	}

	@Override
	public List<Date_Of_Examination> getAllDate_Of_Examination() {
		
		List<Date_Of_Examination> lit_de = examen.getAllDate_Of_Examination();
		
		return lit_de ;
	}

	@Override
	public int deleteDate_Of_Examination(String room) {
		
		int rom = Integer.valueOf(room);
		
		Date_Of_Examination e = getDate_Of_ExaminationById(room);
		
		if(e!=null) {
			 
			  examen.getDate_Of_ExaminationById(rom);
			  return 1;	     
		}
		else return 0;	
		
	}

	@Override
	public Date_Of_Examination updateDate_Of_Examination(String room, String date, String time, String module) {
		
		int rom = Integer.valueOf(room);
		
		Date_Of_Examination e = getDate_Of_ExaminationById(room);
		
		e.setRoom(rom);
		e.setDate(date);
		e.setModule(module);
		e.setTime(time);
		
		examen.updateDate_Of_Examination(e);
		
		return e;
	}

	@Override
	public Date_Of_Examination getDate_Of_ExaminationById(String room) {
		
		int rom = Integer.valueOf(room);
		
		return examen.getDate_Of_ExaminationById(rom);
	}

}
