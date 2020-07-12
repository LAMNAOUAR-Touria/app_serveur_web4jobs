 package com.web4job.App.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table
public class Competence {
	
	@Id
	@Column
	@GeneratedValue( strategy=GenerationType.AUTO)
	private long id;
	@Column
	private  String intituleCompetence;
	@Column
	private String degreMaitrise;

	public Competence(long id, String intituleCompetence, String degreMaitrise) {
		this.id = id;
		this.intituleCompetence = intituleCompetence;
		this.degreMaitrise = degreMaitrise;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIntituleCompetence() {
		return intituleCompetence;
	}

	public void setIntituleCompetence(String intituleCompetence) {
		this.intituleCompetence = intituleCompetence;
	}

	public String getDegreMaitrise() {
		return degreMaitrise;
	}

	public void setDegreMaitrise(String degreMaitrise) {
		this.degreMaitrise = degreMaitrise;
	}
}
