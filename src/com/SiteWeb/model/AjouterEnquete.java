package com.SiteWeb.model;

import java.sql.SQLException;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.bean.Enquete;
import com.mysql.jdbc.PreparedStatement;

public class AjouterEnquete {
	public void ajoutEnquete(Enquete e){
		ConnectBDD connec=new ConnectBDD();
		try {
		PreparedStatement preparedStatement= (PreparedStatement) connec.connect.prepareStatement("INSERT INTO enquete(type_E,etat_E) VALUES(?,?)");

preparedStatement.setString(1, e.getType_E());
preparedStatement.setString(2, e.getEtat_E());
preparedStatement.executeUpdate();


			
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
	}


}
