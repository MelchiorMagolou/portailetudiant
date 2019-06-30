package org.etudiant.portail.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity 
public class Student implements Serializable {
	
	
    @Id
    private String cin_std ;
	
	private String cne_std ;
	
	private String name_std ;
	
	private String first_name_std ;
	
	private String birth_date;

	private String email_std ;
	
	private String address_std ;
	
    private String spinneret ;
	
	public List<Notes_Average> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes_Average> notes) {
		this.notes = notes;
	}

	private String University_level ;
	
	@OneToMany(mappedBy="id_note")
	private List<Notes_Average> notes;
	
	/**
	 * 
	 */
	public Student() {
		super();
	}

	public String getCin_std() {
		return cin_std;
	}

	public void setCin_std(String cin_std) {
		this.cin_std = cin_std;
	}

	public String getCne_std() {
		return cne_std;
	}

	public void setCne_std(String cne_std) {
		this.cne_std = cne_std;
	}

	public String getName_std() {
		return name_std;
	}

	public void setName_std(String name_std) {
		this.name_std = name_std;
	}

	public String getFirst_name_std() {
		return first_name_std;
	}

	public void setFirst_name_std(String first_name_std) {
		this.first_name_std = first_name_std;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getEmail_std() {
		return email_std;
	}

	public void setEmail_std(String email_std) {
		this.email_std = email_std;
	}

	public String getAddress_std() {
		return address_std;
	}

	public void setAddress_std(String address_std) {
		this.address_std = address_std;
	}

	public String getSpinneret() {
		return spinneret;
	}

	public void setSpinneret(String spinneret) {
		this.spinneret = spinneret;
	}

	public String getUniversity_level() {
		return University_level;
	}

	public void setUniversity_level(String university_level) {
		University_level = university_level;
	}
		
	
}
