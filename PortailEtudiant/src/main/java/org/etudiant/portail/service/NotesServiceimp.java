package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.NotesDAO;
import org.etudiant.portail.model.Notes_Average;
import org.etudiant.portail.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NotesServiceimp implements NotesService {

	
	@Autowired
	private NotesDAO notes ;
	
	@Override
	public Notes_Average addNotes_Average(String id_note, Student etd, String module, double note_average) {
		
		Notes_Average n = new Notes_Average();
		int id = Integer.valueOf(id_note);
		n.setId_note(id);
		n.setEtd(etd);
		n.setModule(module);
		n.setNote_average(note_average);
		notes.addNotes_Average(n);
		return n;
	}

	@Override
	public List<Notes_Average> getAllNotes_Average() {
		
		List<Notes_Average> list_note = notes.getAllNotes_Average();
		
		return list_note ;
	}

	@Override
	public Notes_Average updateNotes_Average(String id_note, Student etd, String module, double note_average) {
		
		int id = Integer.valueOf(id_note);
		Notes_Average n = getNotes_AverageById(id_note);
		n.setId_note(id);
		n.setEtd(etd);
		n.setModule(module);
		n.setNote_average(note_average);
		notes.getNotes_AverageById(id);
		return n;
	}

	@Override
	public Notes_Average getNotes_AverageById(String id_note) {
		
		int id = Integer.valueOf(id_note);
		Notes_Average n= notes.getNotes_AverageById(id);
		return n;
	}

	@Override
	public Notes_Average getNotes_AverageBymodule(String module) {
		
		Notes_Average n= notes.getNotes_AverageBymodule(module);
		return n;
	}

}
