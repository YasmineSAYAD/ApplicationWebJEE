package com.SiteWeb.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.bean.Enquete;
import com.mysql.jdbc.PreparedStatement;

public class MajEnquete {
	ConnectBDD co = new ConnectBDD();
	Statement stm;
	ResultSet rs;
	
	public ArrayList<Enquete> rechercheEnquete(String type) {
	
	ArrayList<Enquete> listE=new ArrayList<Enquete>();
	try {
		stm=co.connect.createStatement();
		rs=stm.executeQuery("select * from enquete where type_E='"+type+"'");
		while (rs.next()) {
			Enquete e=new Enquete();
			String type_E=rs.getString("type_E");
			String etat_E=rs.getString("etat_E");
		
			e.setEtat_E(etat_E);
			e.setType_E(type_E);
		
			listE.add(e);
			
		}
		
	} catch (Exception e) {
		
	}
		return listE;
		
	}


	public void modifEnquete(Enquete e) {
		
		try {
			stm = co.connect.createStatement();
			stm.executeUpdate("update enquete set etat_E='" + e.getEtat_E()
					+ "',type_E='" + e.getType_E() 
					
					+ "' where type_E='" + e.getType_E()+ "'");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public List<Enquete> actualise() {
		RecupererEnquete c=new RecupererEnquete();
		List<Enquete> le=c.listeEnquete();
		return le;
	}}

