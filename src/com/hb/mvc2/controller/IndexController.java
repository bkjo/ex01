package com.hb.mvc2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class IndexController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.print("<h1>index</h1>");
		System.out.println(request.getParameter("id"));
		request.setAttribute("msg", "Hellow");
		
//		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
//		rd.forward(request,response);
		response.sendRedirect("Ex01.do");
	}

}
