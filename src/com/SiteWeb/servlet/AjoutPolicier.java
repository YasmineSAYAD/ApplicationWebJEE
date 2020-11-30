package com.SiteWeb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SiteWeb.bean.Policier;
import com.SiteWeb.model.AjouterPolicier;
import com.SiteWeb.model.RecupererEnquete;
import com.SiteWeb.model.RecupererPolicier;

public class AjoutPolicier extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
			Policier p=new Policier();
			p.setGrade_p(req.getParameter("grade"));
			p.setMatricule(req.getParameter("matricule"));
		    p.setNom_p(req.getParameter("nom"));
			p.setPrenom_p(req.getParameter("prenom"));
			p.setDateNais(req.getParameter("dateNais"));
			p.setId_cm(1);
		    AjouterPolicier ajoutP=new AjouterPolicier();
			ajoutP.ajoutPolicier(p);
			  RecupererPolicier policier=new RecupererPolicier();
				req.setAttribute("lp", policier.listePolicier());
		 
			  this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutPolicier.jsp").forward(req, resp);}
	
		
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
