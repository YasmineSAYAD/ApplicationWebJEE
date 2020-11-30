package com.SiteWeb.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.SiteWeb.bean.Criminel;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;



public class RecupererCriminel {
	public ArrayList<Criminel> listeCriminel() {
		ArrayList<Criminel> listC=new ArrayList<Criminel>();
		//connexion à la BDD
		ConnectBDD connec=new ConnectBDD();
		//l'envoie de la requête à la bdd
		Statement state = null;
		ResultSet resultset = null;
		try {
		state=connec.connect.createStatement();
		//execution de la requete
		resultset=state.executeQuery("SELECT * FROM criminel;");
		//recuperer les données
		while (resultset.next()) {
			
			String nom_C=resultset.getString("nom_C");
			String prenom_C=resultset.getString("prenom_C");
			String duree_incrimination=resultset.getString("duree_incrimination");
			String date_incrimination=resultset.getString("date_incrimination");
			
			String code_C=resultset.getString("code_C");
			Criminel c=new Criminel();
			c.setNom_C(nom_C);
			c.setPrenom_C(prenom_C);
			c.setDate_incrimination(date_incrimination);
			c.setDuree_incrimination(duree_incrimination);
			c.setCode_c(code_C);
			
			listC.add(c);
			
		}
			
		} catch (Exception e) {
		System.err.println();
		}finally {//fermeture de toutes les connexions
			
				try {
					if (state!=null) {
					state.close();}
					if (resultset!=null) {
						resultset.close();
					}
					
				} catch (SQLException e2) {
			
				}
			
				
			}
		
		
	return listC;	
	}


}
