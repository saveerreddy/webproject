package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServlethttpDemo extends HttpServlet 
{
	
	public void init(ServletConfig config) throws ServletException 
	{
	}

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	out.println("<h3> Hi welcome");
    	
	}

	public void destroy() {
		
	}

	
	
}
