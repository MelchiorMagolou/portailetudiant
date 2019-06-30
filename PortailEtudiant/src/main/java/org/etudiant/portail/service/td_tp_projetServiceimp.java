package org.etudiant.portail.service;

import java.util.List;

import org.etudiant.portail.dao.td_tp_projetDAO;
import org.etudiant.portail.model.TD_TP_Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class td_tp_projetServiceimp implements td_tp_projetService {

	@Autowired
	private td_tp_projetDAO doc ;
	
	@Override
	public TD_TP_Projet addTD_TP_Projet(String id_doct,String type , boolean rendu , double note_type ,String  title , String name_prof , String module, String spinneret,byte[] file) {
		
		int id = Integer.valueOf(id_doct);
		
		TD_TP_Projet t = new TD_TP_Projet ();
		t.setFile(file);
		t.setId_doc(id);
		t.setModule(module);
		t.setName_prof(name_prof);
		t.setNote_type(note_type);
		t.setRendu(rendu);
		t.setSpinneret(spinneret);
		t.setTitle(title);
		t.setType(type);
		
		doc.addTD_TP_Projet(t);
				
		return t;
	}

	@Override
	public List<TD_TP_Projet> getAllTD_TP_Projet() {
		
		List<TD_TP_Projet>  lit = doc.getAllTD_TP_Projet();
		
		return lit;
	}

	@Override
	public TD_TP_Projet updateTD_TP_Projet(String id_doct,String type , boolean rendu , double note_type ,String  title , String name_prof , String module, String spinneret,byte[] file) {
		
		TD_TP_Projet t= getTD_TP_ProjetById(id_doct);
		int id = Integer.valueOf(id_doct);
		
		if(t!=null) {
			
			t.setFile(file);
			t.setId_doc(id);
			t.setModule(module);
			t.setName_prof(name_prof);
			t.setNote_type(note_type);
			t.setRendu(rendu);
			t.setSpinneret(spinneret);
			t.setTitle(title);
			t.setType(type);
			
			doc.updateTD_TP_Projet(t);
		}
		
		return t;
	}

	@Override
	public TD_TP_Projet getTD_TP_ProjetById(String id_doct) {
		
		int id = Integer.valueOf(id_doct);
		TD_TP_Projet t = doc.getTD_TP_ProjetById(id);
		
		
		return t;
	}

}
