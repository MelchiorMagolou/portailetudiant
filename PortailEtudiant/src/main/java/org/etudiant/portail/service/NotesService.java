package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.model.*;


public interface NotesService {

	public Notes_Average addNotes_Average(String id_note,Student etd,String module,double note_average);
	public List<Notes_Average>getAllNotes_Average();
	public Notes_Average updateNotes_Average(String id_note,Student etd,String module,double note_average);
	public Notes_Average getNotes_AverageById(String id_note);
	public Notes_Average getNotes_AverageBymodule(String module);
	
}
