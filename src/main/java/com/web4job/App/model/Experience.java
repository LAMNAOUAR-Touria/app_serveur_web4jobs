package com.web4job.App.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Experience {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String organisme;
	@Column
	private String lieu;
	@Column
	private Date dateDebut;
    @Column
	private Date dateFin;
	@Column
	private String profil;
	@Column
	private String descriptionPost;

	public Experience(long id, String organisme, String lieu, Date dateDebut, Date dateFin, String profil, String descriptionPost) {
		this.id = id;
		this.organisme = organisme;
		this.lieu = lieu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.profil = profil;
		this.descriptionPost = descriptionPost;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrganisme() {
		return organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getDescriptionPost() {
		return descriptionPost;
	}

	public void setDescriptionPost(String descriptionPost) {
		this.descriptionPost = descriptionPost;
	}
}
