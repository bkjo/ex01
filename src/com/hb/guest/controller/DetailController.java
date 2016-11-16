package com.hb.guest.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;


@WebServlet("/guest/detail.do")
public class DetailController extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sabun = Integer.parseInt(request.getParameter("idx"));
		
		GuestDao dao = null;
		GuestDto dto = new GuestDto();
		try {
			dao = new GuestDao();
			dto = dao.detail(sabun);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("alist", dto);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
	}

}
