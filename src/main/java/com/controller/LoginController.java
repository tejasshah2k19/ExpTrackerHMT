package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		Cookie c = new Cookie("clogin", "yes");
		c.setMaxAge(60*60*24*7);//7days 
		response.addCookie(c);
		//read 
		
		//validation 
		
		//db check - authenticate 
		
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);
		
	}
}
