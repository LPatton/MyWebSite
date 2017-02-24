package com.two.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logingC1
 */
public class logingC1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public logingC1() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String u = request.getParameter("username");
		String p = request.getParameter("passwd");

		if (u.equals("lxl") && p.equals("123")) {
			HttpSession hs = request.getSession(true);
			hs.setMaxInactiveInterval(30);
			hs.setAttribute("username", u);
			response.sendRedirect("welcome?name=" + u + "passwd=" + p);
		} else {
			response.sendRedirect("loging");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
