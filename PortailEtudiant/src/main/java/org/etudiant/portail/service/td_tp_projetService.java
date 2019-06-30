package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.model.TD_TP_Projet;

public interface td_tp_projetService {
	
	public TD_TP_Projet addTD_TP_Projet(String id_doct,String type , boolean rendu , double note_type ,String  title , String name_prof , String module, String spinneret,byte[] file);
	public List<TD_TP_Projet> getAllTD_TP_Projet();
	public TD_TP_Projet updateTD_TP_Projet(String id_doct,String type , boolean rendu , double note_type ,String  title , String name_prof , String module, String spinneret,byte[] file);
	public TD_TP_Projet getTD_TP_ProjetById(String id);

}
