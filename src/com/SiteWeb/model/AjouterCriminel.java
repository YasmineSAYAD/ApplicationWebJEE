package com.SiteWeb.model;

import java.sql.SQLException;


import com.SiteWeb.bean.Criminel;
import com.mysql.jdbc.PreparedStatement;

public class AjouterCriminel {
	public void ajoutCriminel(Criminel c){
		ConnectBDD connec=new ConnectBDD();
		try {
		PreparedStatement preparedStatement= (PreparedStatement) connec.connect.prepareStatement("INSERT INTO criminel(code_C,nom_C,prenom_C,duree_incrimination,date_incrimination) VALUES(?,?,?,?,?)");

preparedStatement.setString(1, c.getCode_c());
preparedStatement.setString(2, c.getNom_C());
preparedStatement.setString(3, c.getPrenom_C());
preparedStatement.setString(4, c.getDuree_incrimination());
preparedStatement.setString(5, c.getDate_incrimination());
preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
