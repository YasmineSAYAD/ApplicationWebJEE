package com.SiteWeb.bean;

import java.sql.Date;



public class Policier {
public Policier() {
		super();
		// TODO Auto-generated constructor stub
	}

int id_cm,id_P;
String matricule,nom_p,prenom_p,grade_p,dateNais;
public int getId_P() {
	return id_P;
}

public void setId_P(int id_P) {
	this.id_P = id_P;
}



public String getDateNais() {
	return dateNais;
}

public void setDateNais(String dateNais) {
	this.dateNais = dateNais;
}

public int getId_cm() {
	return id_cm;
}

public void setId_cm(int id_cm) {
	this.id_cm = id_cm;
}



public String getMatricule() {
	return matricule;
}

public void setMatricule(String matricule) {
	this.matricule = matricule;
}

public String getNom_p() {
	return nom_p;
}

public void setNom_p(String nom_p) {
	this.nom_p = nom_p;
}

public String getPrenom_p() {
	return prenom_p;
}

public void setPrenom_p(String prenom_p) {
	this.prenom_p = prenom_p;
}

public String getGrade_p() {
	return grade_p;
}

public void setGrade_p(String grade_p) {
	this.grade_p = grade_p;
}

@Override
public String toString() {
	return "Policier [id_cm=" + id_cm + ", id_P=" + id_P + ", matricule="
			+ matricule + ", nom_p=" + nom_p + ", prenom_p=" + prenom_p
			+ ", grade_p=" + grade_p + ", dateNais=" + dateNais + "]";
}

}
