package org.etudiant.portail.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity 
@Table(name="Notes_Average")
public class Notes_Average implements Serializable  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_note;
	
	@ManyToOne 
	private Student etd ;
	
	private String module ;
	
	private double  note_average; 
	
	
	/**
	 * 
	 */
	public Notes_Average () {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId_note() {
		return id_note;
	}


	public void setId_note(int id_note) {
		this.id_note = id_note;
	}


	public double getNote_average() {
		return note_average;
	}


	public void setNote_average(double note_average) {
		this.note_average = note_average;
	}


	public Student getEtd() {
		return etd;
	}
	
	public void setEtd(Student etd) {
		this.etd = etd;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	

}
