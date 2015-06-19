package com.changyou.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.changyou.demo.util.db.DBPoolUtil;
import com.changyou.demo.util.db.DBUtil;

import lombok.extern.log4j.Log4j;

@Log4j
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		log.info("[" + name + "] is trying to login...");
		if ("admin".equals(name)) {
			req.setAttribute("msg", "hello, admin!");
		} else {
			req.setAttribute("msg", "OMG, what is your name?");
		}
		DBUtil.getInstance().getConnection();
		DBPoolUtil.getInstance().getConnection();
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	
	
}
