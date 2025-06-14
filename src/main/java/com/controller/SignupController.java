package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// read parameter
		// firstName email lastName password city

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String city = request.getParameter("city");

		// validation 420
		// required
		// regex

		boolean isError = false;
		if (firstName == null || firstName.isBlank()) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}

		if (lastName == null || lastName.isBlank()) {
			isError = true;
			request.setAttribute("lastNameError", "Please Enter LastName");
		}
		if (email == null || email.isBlank()) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}
		if (password == null || password.isBlank()) {

			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if(isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);
			
		}else {
			// validation success
			// db insert
			// open login page
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
			
		}

	}

}
