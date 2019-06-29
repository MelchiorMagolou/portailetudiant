package org.etudiant.portail.dao;
import org.etudiant.portail.model.td_tp_projet;

import antlr.collections.List;;
public interface td_tp_projetDAO {
	public void addtd_tp_projet(td_tp_projet ttp);
	public List getAlltd_tp_projet();
	public void updatetd_tp_projet(td_tp_projet ttp);
	public td_tp_projet gettd_tp_projetBytype(String type);
	public double getAVG();
 
	}
