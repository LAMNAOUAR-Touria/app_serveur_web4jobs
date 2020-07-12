package com.web4job.App.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Certificat {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  id;
	@Column
	private String intituleCertificat;
	@Column
	private String organisme;
	@Column
	private Date dateObtontion;
	@Column
	private String descriptionCertificat;
	@Column
	private String lieu;

	public Certificat(long id, String intituleCertificat, String organisme, Date dateObtontion, String descriptionCertificat, String lieu) {
		this.id = id;
		this.intituleCertificat = intituleCertificat;
		this.organisme = organisme;
		this.dateObtontion = dateObtontion;
		this.descriptionCertificat = descriptionCertificat;
		this.lieu = lieu;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIntituleCertificat() {
		return intituleCertificat;
	}

	public void setIntituleCertificat(String intituleCertificat) {
		this.intituleCertificat = intituleCertificat;
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

	public String getDescriptionCertificat() {
		return descriptionCertificat;
	}

	public void setDescriptionCertificat(String descriptionCertificat) {
		this.descriptionCertificat = descriptionCertificat;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
}
