package com.SiteWeb.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.SiteWeb.bean.Policier;
import com.mysql.jdbc.PreparedStatement;

public class MajPolicier {
	ConnectBDD co = new ConnectBDD();
	Statement stm;
	ResultSet rs;
	Policier	p=new Policier();
	
	//recherche
	public Policier recherchePolicier(String matricule) {
		
		try {
			
			stm=co.connect.createStatement();
			rs=stm.executeQuery("select * from policier where matricule='"+matricule+"'");
			while (rs.next()) {
			
				String nom=rs.getString("nom_P");
				String prenom=rs.getString("prenom");
				String grade=rs.getString("grade");
				String dateNais=rs.getString("dateNais");
				String mat=rs.getString("matricule");
				
				p.setMatricule(mat);
				p.setNom_p(nom);
				p.setPrenom_p(prenom);
				p.setGrade_p(grade);
				p.setDateNais(dateNais);
				
				
				
			}
			
		} catch (Exception e) {
			
		}
			return p;
			
		}
	// suppression
		public void supprPolicier(String matricule) {
			try {
				stm = co.connect.createStatement();
				stm.executeUpdate("delete from policier where matricule='" + matricule + "'");
			} catch (SQLException e) {
			
				e.printStackTrace();
			}

		}
		
		
//modification
		public void modifStagiaire(Policier p) {
			
			try {
				stm = co.connect.createStatement();
				stm.executeUpdate("update policier set nom_P='" + p.getNom_p()
						+ "',prenom='" + p.getPrenom_p() + "',grade='"
						+ p.getGrade_p()+ "',dateNais='" + p.getDateNais()
					    + "',matricule='" + p.getMatricule()
						+ "' where matricule='" + p.getMatricule() + "'");

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		
		
//actualisation
		public List<Policier> actualise() {
			RecupererPolicier recp=new RecupererPolicier();
			List<Policier> lp=recp.listePolicier();
			return lp;
		}}
