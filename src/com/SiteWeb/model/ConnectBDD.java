package com.SiteWeb.model;

import java.sql.Connection;
import java.sql.DriverManager;

import com.SiteWeb.bean.Criminel;

public class ConnectBDD {
	public Connection connect;
	public  ConnectBDD() {
	//la connexion au serveur de la bdd
		try {
			Class.forName("com.mysql.jdbc.Driver");			
		} catch (Exception e) {
			System.err.println("Driver JDBC introuvable : "+e);
		}
		//la connexion à la bdd
		try {
			String url="jdbc:mysql://localhost:3306/basecriminel";
			String user="root";
			String password="";
			connect=DriverManager.getConnection(url,user,password);
			System.out.println("La connexion à la BDD est réussie");
			
		} catch (Exception e) {
			System.err.println("erreur de connexion à la BDD"+e);
		}
	}
	
	
	}


