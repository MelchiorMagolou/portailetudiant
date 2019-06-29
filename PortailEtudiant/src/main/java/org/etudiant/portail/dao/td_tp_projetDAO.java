package org.etudiant.portail.dao;
import org.etudiant.portail.model.*;

import antlr.collections.List;;
public interface td_tp_projetDAO {
	public void addtd_tp_projet(TD_TP_Projet ttp);
	public List getAlltd_tp_projet();
	public void updatetd_tp_projet(TD_TP_Projet ttp);
	public TD_TP_Projet gettd_tp_projetBytype(String type);
	public double getAVG();
 
	}
