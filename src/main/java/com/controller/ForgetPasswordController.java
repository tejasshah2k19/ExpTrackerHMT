package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForgetPasswordController")
public class ForgetPasswordController extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//read 
		//db check 
		//otp generate 
		//mail send -> otp 
		
		//
		RequestDispatcher rd = request.getRequestDispatcher("ChangePassword.jsp");
		rd.forward(request, response);
	
	}
}
