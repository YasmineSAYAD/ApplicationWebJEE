package com.SiteWeb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SiteWeb.bean.Enquete;
import com.SiteWeb.model.AjouterEnquete;
import com.SiteWeb.model.RecupererEnquete;

public class AjoutEnquete extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Enquete e=new Enquete();
		
		e.setType_E(req.getParameter("type_E"));
		e.setEtat_E(req.getParameter("etat_E"));
		AjouterEnquete ajoutE=new AjouterEnquete();
		ajoutE.ajoutEnquete(e);
		  RecupererEnquete enquete=new RecupererEnquete();
			req.setAttribute("len", enquete.listeEnquete());
	    this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutEnquete.jsp").forward(req, resp);
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	doGet(req, resp);
}
}
