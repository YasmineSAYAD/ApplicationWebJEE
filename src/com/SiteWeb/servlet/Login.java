package com.SiteWeb.servlet;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.ListCellRenderer;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.bean.Enquete;
import com.SiteWeb.bean.Policier;
import com.SiteWeb.model.RecupererCriminel;
import com.SiteWeb.model.RecupererEnquete;
import com.SiteWeb.model.RecupererPolicier;

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		RecupererPolicier policier=new RecupererPolicier();

HttpSession session=req.getSession();
String psw=(String) session.getAttribute("psw");
String matricule=(String) session.getAttribute("matricule");
		for (int i = 0; i < policier.listeMatricule().size(); i++) {
			for (int j = 0; j < policier.listeGrade().size(); j++) {
				for (int n = 0; n < policier.listeDate().size(); n++) {

					if ((i == j) && (j == n)) {

						if (policier.listePolicier().get(i).getMatricule()
								.equals(req.getParameter("matricule"))
								&& (policier.listePolicier().get(j)
										.getGrade_p().equals("policier"))
								&& policier.listePolicier().get(n)
										.getDateNais()
										.equals(req.getParameter("psw"))) {
							RecupererEnquete enq = new RecupererEnquete();
							req.setAttribute("len", enq.listeEnquete());
							this.getServletContext()
									.getRequestDispatcher(
											"/WEB-INF/Consultation.jsp")
									.forward(req, resp);
						} else {

							if (policier.listePolicier().get(i).getMatricule()
									.equals(req.getParameter("matricule"))
									&& (policier.listePolicier().get(j)
											.getGrade_p()
											.equals("administrateur"))
									&& policier.listePolicier().get(n)
											.getDateNais()
											.equals(req.getParameter("psw"))) {
								this.getServletContext()
										.getRequestDispatcher(
												"/WEB-INF/Gestion.jsp")
										.forward(req, resp);

							}
						}
					}
				}
			}
		}
		String msg = "Matricule ou mot de passe incorrect";
		req.setAttribute("msg", msg);
		this.getServletContext().getRequestDispatcher("/Login.jsp")
				.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//gerer les sessions
		HttpSession session=req.getSession();
		String matricule=req.getParameter("matricule");
		String psw=req.getParameter("psw");
		session.setAttribute("matricule", matricule);
		session.setAttribute("psw", psw);
		doGet(req, resp);
	}

}
