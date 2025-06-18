package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckingController")
public class CheckingController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Checking controller....");

		// cookie -> clogin -> present?
		// yes
		// goto home page
		// no
		// goto login

		// get all cookies -> browser
		Cookie c[] = request.getCookies();

		boolean flag = false;

		for (int i = 0; i < c.length; i++) {
			if (c[i].getName().equals("clogin")) {
				flag = true;
			}
		}

		// false => Login.jsp

		if (flag == true) {
			response.sendRedirect("Home.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}

	}
}
