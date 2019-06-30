package org.etudiant.portail.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity 
public class Planning implements Serializable {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id_day ;
	 
	 private String day ;
	 
	 private String time ; 
	 
	 private int room ;
	 
	 private boolean td ;
	 
	 private boolean tp ;
	 
	 private boolean course ;
	 
	 private boolean project ;
	 
	 private boolean exam ;
	 
	 @OneToOne(mappedBy = "planning")
	 private Professor prof ;
	 
	 private String module ;

	/**
	 * 
	 */
	public Planning() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_day() {
		return id_day;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public void setId_day(int id_day) {
		this.id_day = id_day;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public boolean isTd() {
		return td;
	}

	public void setTd(boolean td) {
		this.td = td;
	}

	public boolean isTp() {
		return tp;
	}

	public void setTp(boolean tp) {
		this.tp = tp;
	}

	public boolean isCourse() {
		return course;
	}

	public void setCourse(boolean course) {
		this.course = course;
	}

	public boolean isProject() {
		return project;
	}

	public void setProject(boolean project) {
		this.project = project;
	}

	public boolean isExam() {
		return exam;
	}

	public void setExam(boolean exam) {
		this.exam = exam;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}
	 
	 
	 
	
}
