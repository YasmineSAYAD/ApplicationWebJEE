package com.SiteWeb.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.SiteWeb.bean.Criminel;

public class MajCriminel {
	ConnectBDD co = new ConnectBDD();
	Statement stm;
	ResultSet rs;
	
	public Criminel rechercheCriminel(String code) {
		Criminel c=new Criminel();
	try {
		stm=co.connect.createStatement();
		rs=stm.executeQuery("select * from criminel where code_C='"+code+"'");
		while (rs.next()) {
		
			String nom_C=rs.getString("nom_C");
			String prenom_C=rs.getString("prenom_C");
			String code_C=rs.getString("code_C");
			String duree_incrimination=rs.getString("duree_incrimination");
			String date_incrimination=rs.getString("date_incrimination");
			c.setNom_C(nom_C);
			c.setPrenom_C(prenom_C);
			c.setCode_c(code_C);
			c.setDate_incrimination(date_incrimination);
			c.setDuree_incrimination(duree_incrimination);
			
			
		}
		
	} catch (Exception e) {
		
	}
		return c;
		
	}


	public void modifCriminel(Criminel c) {
		
		try {
			stm = co.connect.createStatement();
			stm.executeUpdate("update criminel set nom_C'" + c.getNom_C()
					 + "',prenom_C='"
					+ c.getPrenom_C() + "',duree_incrimination='" +c.getDuree_incrimination()
					+ "',date_incrimination='" +c.getDate_incrimination()
					+ "' where nom_C='" + c.getNom_C() + "'");

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	public List<Criminel> actualise() {
		RecupererCriminel c=new RecupererCriminel();
		List<Criminel> ls=c.listeCriminel();
		return ls;
	}

	
}
