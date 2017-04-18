package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginDemo extends HttpServlet {
	


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    response.setContentType("text/html");
	    
	    PrintWriter out=response.getWriter();
	    
	    		String un=request.getParameter("username");
	    		String pw=request.getParameter("password");
	    		if(un.equals("anusha")&&pw.equals("pass"))
	    		{
	    			/*out.print("<h2>Welcome User!!</h2>");*/
	    			
	    			response.sendRedirect("success.html");
	    			
	    		}
	    		else
	    		{
	    			
	    			response.sendRedirect("login.html");
	    			out.println("sorry credential is mismatch");
	    			
	    		}
	     
	
	
	
	
	}

}
