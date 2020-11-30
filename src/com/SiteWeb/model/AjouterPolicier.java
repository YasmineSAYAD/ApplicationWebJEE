package com.SiteWeb.model;

import java.sql.SQLException;
import com.SiteWeb.bean.Policier;
import com.mysql.jdbc.PreparedStatement;

public class AjouterPolicier {
	public void ajoutPolicier(Policier p){
		ConnectBDD connec=new ConnectBDD();
		try {
		PreparedStatement preparedStatement= (PreparedStatement) connec.connect.prepareStatement("INSERT INTO policier(dateNais,grade,id_cm,matricule,nom_P,prenom) VALUES(?,?,?,?,?,?)");
		preparedStatement.setString(1, p.getDateNais());
		preparedStatement.setString(2, p.getGrade_p());
	    preparedStatement.setInt(3, p.getId_cm());
		preparedStatement.setString(4, p.getMatricule());
        preparedStatement.setString(5,p.getNom_p());
        preparedStatement.setString(6, p.getPrenom_p());
        preparedStatement.executeUpdate();


			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


}
