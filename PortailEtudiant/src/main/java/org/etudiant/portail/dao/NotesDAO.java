package org.etudiant.portail.dao;
import org.etudiant.portail.model.*;


public interface NotesDAO {
	public void addnotes(Notes_Average n);
	//public List<notes>getAllnotes();
	public void updatenotes(Notes_Average  n);
	public Notes_Average getnotesById(int id);
	public Notes_Average getnotesBymodule(String module);
	
}
