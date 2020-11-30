package com.SiteWeb.servlet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.bean.Policier;
import com.SiteWeb.model.AjouterCriminel;
import com.SiteWeb.model.AjouterPolicier;



public class GestionPolicier  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		  this.getServletContext().getRequestDispatcher("/WEB-INF/GestionPolicier.jsp").forward(req, resp);
		
	
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
