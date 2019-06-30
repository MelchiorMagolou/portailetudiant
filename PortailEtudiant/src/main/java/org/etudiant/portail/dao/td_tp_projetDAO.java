package org.etudiant.portail.dao;
import java.util.List;

import org.etudiant.portail.model.*;


public interface td_tp_projetDAO {
	public void addTD_TP_Projet(TD_TP_Projet ttp);
	public List<TD_TP_Projet>  getAllTD_TP_Projet();
	public void updateTD_TP_Projet(TD_TP_Projet ttp);
	public TD_TP_Projet getTD_TP_ProjetById(int id);
	 
 
}
