package org.etudiant.portail.dao;
import org.etudiant.portail.model.notes;


public interface NotesDAO {
	public void addnotes(notes n);
	//public List<notes>getAllnotes();
	public void updatenotes(notes n);
	public notes getnotesById(int id);
	public notes getnotesBymodule(String module);
	
}
