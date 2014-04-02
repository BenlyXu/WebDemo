package com.changyou.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if ("admin".equals(req.getParameter("name"))) {
			req.setAttribute("msg", "hello, admin!");
		} else {
			req.setAttribute("msg", "OMG, what is your name?");
		}
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	
	
}
