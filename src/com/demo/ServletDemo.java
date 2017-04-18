package com.demo;

import java.io.*;
import javax.servlet.*;

public class ServletDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h2>Welcome to Servlet Programming:");
		}

	
	
	public void destroy() {
	}


}
