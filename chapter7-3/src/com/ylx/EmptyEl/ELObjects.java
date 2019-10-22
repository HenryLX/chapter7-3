package com.ylx.EmptyEl;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ELObjects")
public class ELObjects extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("username", "requestScope");
		req.getSession().setAttribute("username", "sessionScope");
		ServletContext servletContext = getServletContext();
		servletContext.setAttribute("username", "applicationScope");
		
		req.getRequestDispatcher("/ELObjects.jsp").forward(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
