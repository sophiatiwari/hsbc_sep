package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facebookweb.entity.RegistrationEntity;
import com.facebookweb.service.RegistrationServiceInterface;
import com.facebookweb.utility.ServiceFactory;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
		RegistrationEntity fe=new RegistrationEntity();
		fe.setName(name);
		fe.setPassword(password);
		
		
		RegistrationServiceInterface fs=ServiceFactory.createObject("adminservice");
		boolean i=fs.loginProfileService(fe);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		
		if(i) {
			
			HttpSession ss=request.getSession(true);
			ss.setAttribute("userid", name);
			ss.setAttribute("pass", password);
			
			out.println("welcome "+name+"   <a href=TimeLine>timeline</a>   <a href=friendlist>friendlist</a>");
	
		}
		else {
			out.println("Invalid id and password");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/Login.html");
			rd.include(request, response);
		}
		out.println("</body></html>");
	}

}
