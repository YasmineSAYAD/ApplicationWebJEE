package com.SiteWeb.model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.bean.Policier;

public class RecupererPolicier {
	public ArrayList<Policier> listePolicier() {
		ArrayList<Policier> listP=new ArrayList<Policier>();
		//connexion à la BDD
		ConnectBDD connec=new ConnectBDD();
		//l'envoie de la requête à la bdd
		Statement state = null;
		ResultSet resultset = null;
		try {
		state=connec.connect.createStatement();
		resultset=state.executeQuery("select * from policier");
		//parcourir le resultset
		while (resultset.next()) {
			String matricule=resultset.getObject("matricule").toString();
			String nom_p=resultset.getObject("nom_P").toString();
			String prenom_p=resultset.getObject("prenom").toString();
			String grade_p=resultset.getObject("grade").toString();
			String dateNais=resultset.getObject("dateNais").toString();
			int id_cm=Integer.parseInt(resultset.getString("id_cm"));
			
			Policier p=new Policier();
			p.setMatricule(matricule);
			p.setNom_p(nom_p);
			p.setPrenom_p(prenom_p);
			p.setGrade_p(grade_p);
			p.setDateNais(dateNais);
			p.setId_cm(id_cm);
			listP.add(p);
			
		}
			
		} catch (Exception e) {
		System.err.println();
		}finally {//fermeture de toutes les connexions
			if (state!=null) {
				try {
					state.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
				
			}
			if (resultset!=null) {
				try {
					resultset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
			}
		
	return listP;	
	}
	
	//recuperer les matricules
	public ArrayList<String> listeMatricule() {
		ArrayList<String> listM=new ArrayList<String>();
		//connexion à la BDD
		ConnectBDD connec=new ConnectBDD();
		//l'envoie de la requête à la bdd
		Statement state = null;
		ResultSet resultset = null;
		try {
		state=connec.connect.createStatement();
		resultset=state.executeQuery("select matricule from policier");
		//parcourir le resultset
		while (resultset.next()) {
			String matricule=resultset.getObject("matricule").toString();
			
			listM.add(matricule);
			
		}
			
		} catch (Exception e) {
		System.err.println();
		}finally {//fermeture de toutes les connexions
			if (state!=null) {
				try {
					state.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
				
			}
			if (resultset!=null) {
				try {
					resultset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
			}
		
	return listM;	
	}
	//recuperer les grades
	public ArrayList<String> listeGrade() {
		ArrayList<String> listG=new ArrayList<String>();
		//connexion à la BDD
		ConnectBDD connec=new ConnectBDD();
		//l'envoie de la requête à la bdd
		Statement state = null;
		ResultSet resultset = null;
		try {
		state=connec.connect.createStatement();
		resultset=state.executeQuery("select grade from policier");
		//parcourir le resultset
		while (resultset.next()) {
			String grade=resultset.getObject("grade").toString();
			
			listG.add(grade);
			
		}
			
		} catch (Exception e) {
		System.err.println();
		}finally {//fermeture de toutes les connexions
			if (state!=null) {
				try {
					state.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
				
			}
			if (resultset!=null) {
				try {
					resultset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
			}
		
	return listG;	
	}
	
	//recuperer les date de naissance
		public ArrayList<String> listeDate() {
			ArrayList<String> listD=new ArrayList<String>();
			//connexion à la BDD
			ConnectBDD connec=new ConnectBDD();
			//l'envoie de la requête à la bdd
			Statement state = null;
			ResultSet resultset = null;
			try {
			state=connec.connect.createStatement();
			resultset=state.executeQuery("select dateNais from policier");
			//parcourir le resultset
			while (resultset.next()) {
				String dateNais=resultset.getObject("dateNais").toString();
				
				listD.add(dateNais);
				
			}
				
			} catch (Exception e) {
			System.err.println();
			}finally {//fermeture de toutes les connexions
				if (state!=null) {
					try {
						state.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				
					
				}
				if (resultset!=null) {
					try {
						resultset.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
				}
			
		return listD;	
		}
	
}
