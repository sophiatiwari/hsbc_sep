package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.facebookweb.entity.RegistrationEntity;
import com.facebookweb.service.RegistrationServiceInterface;
import com.facebookweb.utility.ServiceFactory;

/**
 * Servlet implementation class friendlist
 */
public class friendlist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession ss=request.getSession(true);
		String name=ss.getAttribute("userid").toString();
		
		
		RegistrationEntity fe=new RegistrationEntity();
		fe.setName(name);
		
		RegistrationServiceInterface fs=ServiceFactory.createObject("adminservice");
		List<RegistrationEntity> i=fs.friendProfileService(fe);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		
		if(i.size()>0) {
			for(RegistrationEntity ff:i) {
				out.println(ff.getName());
			}
		}
		else {
			out.println("no friend found");
		}
		
		out.println("</body></html>");
	}
	}
