package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet("/CheckBox")
public class CheckBoxDemo extends HttpServlet {
	


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    response.setContentType("text/html");
	    
	    PrintWriter out=response.getWriter();
	    
	   String param[]=  request.getParameterValues("cb") ;    
	
	for(String p: param)
	{
		
		out.print(p);
	}
	
	
	
	
	}

}
