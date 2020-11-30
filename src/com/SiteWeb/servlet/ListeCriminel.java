package com.SiteWeb.servlet;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.model.MajCriminel;
import com.SiteWeb.model.RecupererCriminel;
import com.SiteWeb.model.RecupererEnquete;
import com.SiteWeb.model.RecupererPolicier;


public class ListeCriminel extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	  RecupererCriminel criminel=new RecupererCriminel();
		req.setAttribute("lc", criminel.listeCriminel());
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeCriminel.jsp").forward(req, resp);
	
	
		
		
	/*	if (req.getParameter("modifier")!=null) {
			
			String nom = req.getParameter("nom_C");
			String prenom = req.getParameter("prenom_C");
			String code = req.getParameter("code_C");
			String date = req.getParameter("date_incrimination");
			String duree = req.getParameter("duree_incrimination");
			Criminel c = new Criminel();
			
			c.setNom_C(nom);
			c.setPrenom_C(prenom);
			c.setCode_c(code);
			c.setDate_incrimination(date);
			c.setDuree_incrimination(duree);
			
			MajCriminel m = new MajCriminel();
			m.modifCriminel(c);
			 RecupererCriminel rc=new RecupererCriminel();
				req.setAttribute("lc", rc.listeCriminel());
			this.getServletContext()
					.getRequestDispatcher("/ListeCriminel.jsp")
					.forward(req, resp);

		}/* else if (req.getParameter("actualiser")!=null) {
			MajCriminel m = new MajCriminel();
			List<Criminel> lc=m.actualise();
			req.setAttribute("list", lc);
			this.getServletContext()
			.getRequestDispatcher("/ListeCriminel.jsp")
			.forward(req, resp);
			
			
		}*/

	/*	if (req.getParameter("rech").equalsIgnoreCase("rech")) {

			MajCriminel m = new MajCriminel();
			Criminel c= new Criminel();
			c = m.rechercheCriminel(req.getParameter("nomrech"));

			req.setAttribute("c", c);
			this.getServletContext()
					.getRequestDispatcher("/ListeCriminel.jsp")
					.forward(req, resp);
		}*/
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	doGet(req, resp);
	}
}
