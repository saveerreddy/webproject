package com.demo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//@WebServlet ("Saveerloginpage")
public class Saveerloginpage extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		if (un.equals("saveer")&&pw.equals("reddy"))
		{
			response.sendRedirect("registrationpage.html");
		}
		else
		{
			response.sendRedirect("Saveerloginpage.html");
		}
	}
}