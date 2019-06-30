package org.etudiant.portail.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
public class Professor implements Serializable {
	
	    @Id
	    private String cin_prof ;
		
		private String name_prof ;
		
		private String first_name_prof ;
		
		private String email_prof ;
		
		private String address_prof ;
		
		private String department ;
		
		@OneToOne
		private Planning planning;

		@OneToMany(mappedBy="prof")
		private List<TD_TP_Projet> doct ;
		
		@OneToMany(mappedBy="prof")
		private List<Course> cours ;
		
		//@OneToOne
		//private Planning planing ;

		/**
		 * 
		 */
		public Professor() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public List<Course> getCours() {
			return cours;
		}



		public void setCours(List<Course> cours) {
			this.cours = cours;
		}



		public String getCin_prof() {
			return cin_prof;
		}



		public void setCin_prof(String cin_prof) {
			this.cin_prof = cin_prof;
		}



		public String getName_prof() {
			return name_prof;
		}



		public void setName_prof(String name_prof) {
			this.name_prof = name_prof;
		}



		public String getFirst_name_prof() {
			return first_name_prof;
		}



		public void setFirst_name_prof(String first_name_prof) {
			this.first_name_prof = first_name_prof;
		}



		public String getEmail_prof() {
			return email_prof;
		}



		public void setEmail_prof(String email_prof) {
			this.email_prof = email_prof;
		}



		public String getAddress_prof() {
			return address_prof;
		}



		public void setAddress_prof(String address_prof) {
			this.address_prof = address_prof;
		}



		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		
		public Planning getPlanning() {
			return planning;
		}



		public void setPlanning(Planning planning) {
			this.planning = planning;
		}



		public List<TD_TP_Projet> getDoct() {
			return doct;
		}



		public void setDoct(List<TD_TP_Projet> doct) {
			this.doct = doct;
		}



		
	

}
