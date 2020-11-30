package com.SiteWeb.servlet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SiteWeb.bean.Policier;
import com.SiteWeb.model.MajPolicier;
import com.SiteWeb.model.RecupererEnquete;
import com.SiteWeb.model.RecupererPolicier;


public class ListePolicier extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		   RecupererPolicier enquete=new RecupererPolicier();
					req.setAttribute("lp", enquete.listePolicier());
					this.getServletContext().getRequestDispatcher("/WEB-INF/ListePolicier.jsp").forward(req, resp);
					// recuperer les sources d'evenement de la jsp
				/*String rech = req.getParameter("recherche");
					String actualise = req.getParameter("actualiser");

					String suppr = req.getParameter("supprimer");
					// programmation suppression

					// int id = Integer.parseInt(req.getParameter("inputRech"));
					// System.out.println(id);
					if (suppr != null) {

						MajPolicier m = new MajPolicier();
						m.supprPolicier(req.getParameter("matricule"));

						this.getServletContext()
								.getRequestDispatcher("/ListePolicier.jsp")
								.forward(req, resp);
					}
					if (req.getParameter("recherche").equals("rech")) {
						MajPolicier m = new MajPolicier();
						Policier p = new Policier();
						p = m.recherchePolicier(req.getParameter("matricule"));

						RecupererPolicier lp = new RecupererPolicier();
						lp.listePolicier();
						req.setAttribute("lp", lp);

						this.getServletContext()
								.getRequestDispatcher("/ListePolicier.jsp")
								.forward(req, resp);
					}*/
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
