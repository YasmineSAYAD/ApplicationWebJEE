package com.SiteWeb.bean;

public class Criminel {
	int id_C;
	public int getId_C() {
		return id_C;
	}

	public void setId_C(int id_C) {
		this.id_C = id_C;
	}

	String nom_C, prenom_C, duree_incrimination, code_c, date_incrimination;

	public String getNom_C() {
		return nom_C;
	}

	public void setNom_C(String nom_C) {
		this.nom_C = nom_C;
	}

	public String getPrenom_C() {
		return prenom_C;
	}

	public void setPrenom_C(String prenom_C) {
		this.prenom_C = prenom_C;
	}

	public String getDuree_incrimination() {
		return duree_incrimination;
	}

	public void setDuree_incrimination(String duree_incrimination) {
		this.duree_incrimination = duree_incrimination;
	}

	public String getDate_incrimination() {
		return date_incrimination;
	}

	public void setDate_incrimination(String date_incrimination) {
		this.date_incrimination = date_incrimination;
	}

	public String getCode_c() {
		return code_c;
	}

	public void setCode_c(String code_c) {
		this.code_c = code_c;
	}

}
