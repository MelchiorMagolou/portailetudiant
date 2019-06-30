package org.etudiant.portail.dao;
import java.util.List;

import org.etudiant.portail.model.*;


public interface NotesDAO {
	public void addNotes_Average(Notes_Average n);
	public List<Notes_Average>getAllNotes_Average();
	public void updateNotes_Average(Notes_Average  n);
	public Notes_Average getNotes_AverageById(int id);
	public Notes_Average getNotes_AverageBymodule(String module);
	
}

