package org.etudiant.portail.model;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="Course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_doc ;
	
	private String  title;
	
	
	private String name_prof ;
	
	private String module ;	

	private String spinneret ;
	
	private byte[] file;
	

	public int getId_doc() {
		return id_doc;
	}


	public void setId_doc(int id_doc) {
		this.id_doc = id_doc;
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
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
