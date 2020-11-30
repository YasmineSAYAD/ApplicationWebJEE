package com.SiteWeb.model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.bean.Enquete;

public class RecupererEnquete {

	public ArrayList<Enquete> listeEnquete() {
		ArrayList<Enquete> listE=new ArrayList<Enquete>();
		//connexion à la BDD
		ConnectBDD connec=new ConnectBDD();
		//l'envoie de la requête à la bdd
		Statement state = null;
		ResultSet resultset = null;
		try {
		state=connec.connect.createStatement();
		resultset=state.executeQuery("select * from enquete");
		//parcourir le resultset
		while (resultset.next()) {
			String type_E=resultset.getObject("type_E").toString();
			String etat_E=resultset.getObject("etat_E").toString();
			
			Enquete e=new Enquete();
			
			e.setType_E(type_E);
			e.setEtat_E(etat_E);
			listE.add(e);
			
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
		
	return listE;	
	}

	//recuperer les enquetes qui concerne un policier
	
	public ArrayList<Enquete> enquetePolicier(String matricule) {
		ArrayList<Enquete> listE=new ArrayList<Enquete>();
		//connexion à la BDD
		ConnectBDD connec=new ConnectBDD();
		//l'envoie de la requête à la bdd
		Statement state = null;
		ResultSet resultset = null;
		try {
		state=connec.connect.createStatement();
		resultset=state.executeQuery("SELECT etat_E, type_E FROM enquete,suivre_enquete,policier WHERE suivre_enquete.id_E=enquete.id_E AND suivre_enquete.id_P=policier.id_P AND matricule='"+matricule+"'"); 
				
		//parcourir le resultset
		while (resultset.next()) {
			
			String type_E=resultset.getObject("type_E").toString();
			String etat_E=resultset.getObject("etat_E").toString();
			
			Enquete e=new Enquete();
			
			e.setType_E(type_E);
			e.setEtat_E(etat_E);
			listE.add(e);
			
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
		
	return listE;	
	}
	
	//les enquetes courantes
	
	public ArrayList<Enquete> listeEnqueteC() {
		ArrayList<Enquete> listE=new ArrayList<Enquete>();
		//connexion à la BDD
		ConnectBDD connec=new ConnectBDD();
		//l'envoie de la requête à la bdd
		Statement state = null;
		ResultSet resultset = null;
		try {
		state=connec.connect.createStatement();
		resultset=state.executeQuery("select * from enquete where etat_E='courant'");
		//parcourir le resultset
		while (resultset.next()) {
			String type_E=resultset.getObject("type_E").toString();
			String etat_E=resultset.getObject("etat_E").toString();
			
			Enquete e=new Enquete();
			
			e.setType_E(type_E);
			e.setEtat_E(etat_E);
			listE.add(e);
			
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
		
	return listE;	
	}
	
				
	

}
