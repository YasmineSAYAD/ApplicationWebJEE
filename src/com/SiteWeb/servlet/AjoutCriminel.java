package com.SiteWeb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.SiteWeb.bean.Criminel;
import com.SiteWeb.model.AjouterCriminel;
import com.SiteWeb.model.RecupererCriminel;


public class AjoutCriminel extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	
			

			Criminel c=new Criminel();
			
			c.setNom_C(req.getParameter("nom"));
			c.setCode_c(req.getParameter("code"));
			c.setPrenom_C(req.getParameter("prenom"));
			c.setDate_incrimination(req.getParameter("date"));
			c.setDuree_incrimination( req.getParameter("duree"));
			AjouterCriminel ajoutC=new AjouterCriminel();
			ajoutC.ajoutCriminel(c);
			 RecupererCriminel enquete=new RecupererCriminel();
				req.setAttribute("lc", enquete.listeCriminel());
			this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutCriminel.jsp").forward(req, resp);
		 
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
