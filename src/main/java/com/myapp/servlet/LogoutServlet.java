package com.myapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	
	 protected void processRequest (HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{
		 response.setContentType("text/html;charset=UTF-8");
		 try (PrintWriter out = response.getWriter()){
			 HttpSession httpSession= request.getSession();
			 httpSession.removeAttribute("current-user");
			 response.sendRedirect("login.jsp");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		 
		 
	 } 
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
