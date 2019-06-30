package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.PlanningDAO;
import org.etudiant.portail.model.Planning;
import org.etudiant.portail.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlanningServiceimp implements PlanningService {
	
	@Autowired
	private PlanningDAO planning ;

	@Override
	public Planning addPlanning(String day, String time, String room, boolean td, boolean tp, boolean course,
			boolean project, boolean exam ,Professor prof,String module ) {
		
		int rom=Integer.valueOf(room);
		
		Planning p = new Planning();
		p.setDay(day);
		p.setTime(time);
		p.setRoom(rom);
		p.setTd(td);
		p.setTp(tp);
		p.setProf(prof);
		p.setExam(exam);
		p.setProject(project);
		p.setModule(module);
		p.setCourse(course);
		
		planning.addPlanning(p);
		
		return p;
	}

	@Override
	public List<Planning> getAllPlanning() {
		
		List<Planning> list_pal = planning.getAllPlanning();
		
		return list_pal;
	}

	@Override
	public void deletePlanning(String id_day) {
		
        int id =  Integer.valueOf(id_day);		
		Planning p = planning.getPlanningById(id);
		
		if(p!=null) {			
			planning.deletePlanning(id);
		}

	}

	@Override
	public Planning updatePlanning(String id_day,String day, String time, String room, boolean td, boolean tp, boolean course,
			boolean project, boolean exam,Professor prof,String module) {
        
		int rom=Integer.valueOf(room);
		
		Planning p = getPlanningById(id_day);
		p.setDay(day);
		p.setTime(time);
		p.setRoom(rom);
		p.setTd(td);
		p.setTp(tp);
		p.setProf(prof);
		p.setExam(exam);
		p.setProject(project);
		p.setModule(module);
		p.setCourse(course);
		
		planning.updatePlanning(p);
		
		return p;
	}

	@Override
	public Planning getPlanningById(String id_day) {
		
		int id =  Integer.valueOf(id_day);
		
		Planning p = planning.getPlanningById(id);
		
		return p;
	}

}
