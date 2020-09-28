package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebookweb.entity.RegistrationEntity;
import com.facebookweb.service.RegistrationServiceInterface;
import com.facebookweb.utility.ServiceFactory;

/**
 * Servlet implementation class RegistrationServlet1
 */
public class RegistrationServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//we are getting the http request from the client using getParameter method. Same as we are taking input using console.
		int i=0;
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String Email = request.getParameter("email");
		String Phone = request.getParameter("phone");
		String country = request.getParameter("country");
		
		//factory object
		RegistrationServiceInterface rs=ServiceFactory.createObject("adminservice");
		
		
		
        RegistrationEntity uai = new RegistrationEntity();  //object of POJO class.
		
		//wrapping the entered data into the POJO object.
		uai.setName(name);
		uai.setPassword(password);
		uai.setEmail(Email);
		uai.setPhone(Phone);
		uai.setCountry(country);
		
		i=rs.addToDatabaseService(uai);
		//getting response from dao to service to controller layer.
		//settling the response format
				response.setContentType("text/html");
				//to print result on browser.
				PrintWriter out = response.getWriter();   //using the factory method.
		
			if(i>0) {
				
				out.println("Registration successful   <a href=Login.html>Continue...</a>");
						
				out.println("Your Name is "+name);
				out.println("<br>Your Password is "+password);
					
			}
			out.println("</body></html>");
			
	
		
	}
		
	
		
	}

