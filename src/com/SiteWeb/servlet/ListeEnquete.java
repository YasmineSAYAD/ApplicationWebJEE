package com.SiteWeb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SiteWeb.model.RecupererEnquete;

public class ListeEnquete extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	   RecupererEnquete enquete=new RecupererEnquete();
				req.setAttribute("len", enquete.listeEnquete());
				this.getServletContext().getRequestDispatcher("/WEB-INF/ListeEnquete.jsp").forward(req, resp);
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	doGet(req, resp);
	}
}
