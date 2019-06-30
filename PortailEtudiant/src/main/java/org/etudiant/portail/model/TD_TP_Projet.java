package org.etudiant.portail.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
public class TD_TP_Projet implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_doct ;
     
	private String type ;
	 
	private boolean rendu ;
	 
	private double note_type ;
	
	private String  title;
	
	private String name_prof ;
	
	private String module ;	

	private String spinneret ;
	
	private byte[] file;
	@ManyToOne
	private Professor prof;

	
	public int getId_doct() {
		return id_doct;
	}

	public void setId_doct(int id_doct) {
		this.id_doct = id_doct;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isRendu() {
		return rendu;
	}

	public void setRendu(boolean rendu) {
		this.rendu = rendu;
	}

	public double getNote_type() {
		return note_type;
	}

	public void setNote_type(double note_type) {
		this.note_type = note_type;
	}

	public int getId_doc() {
		return id_doct;
	}

	public void setId_doc(int id_doct) {
		this.id_doct = id_doct;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName_prof() {
		return name_prof;
	}

	public void setName_prof(String name_prof) {
		this.name_prof = name_prof;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getSpinneret() {
		return spinneret;
	}

	public void setSpinneret(String spinneret) {
		this.spinneret = spinneret;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	/**
	 * 
	 */
	public TD_TP_Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	 
	
	
	

}
