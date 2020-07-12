package com.web4job.App.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Diplome {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String intituleDudiplome;
	@Column
	private String organisme;
	@Column
	private Date dateObtontion;
	@Column
	private String specialite;
	@Column
	private String lieu;

	public String getIntituleDudiplome() {
		return intituleDudiplome;
	}

	public void setIntituleDudiplome(String intituleDudiplome) {
		this.intituleDudiplome = intituleDudiplome;
	}

	public String getOrganisme() {
		return organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public Date getDateObtontion() {
		return dateObtontion;
	}

	public void setDateObtontion(Date dateObtontion) {
		this.dateObtontion = dateObtontion;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
