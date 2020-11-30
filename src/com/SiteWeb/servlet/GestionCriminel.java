package com.SiteWeb.servlet;

import java.io.IOException;
import java.util.ArrayList;





import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SiteWeb.bean.Criminel;
import com.SiteWeb.model.AjouterCriminel;
import com.SiteWeb.model.MajCriminel;
import com.SiteWeb.model.RecupererCriminel;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class GestionCriminel extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		 this.getServletContext().getRequestDispatcher("/WEB-INF/GestionCriminel.jsp").forward(req, resp);


}

	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	doGet(req, resp);
}
}
