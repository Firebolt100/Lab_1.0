package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	TODO:1 Make DisplayCartDetailsServlet as a HttpServlet

@WebServlet("/displayDetails")
public class DisplayCartDetailsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		
		
		String[] dataFromPage =request.getParameterValues("bookName");
		int i=0;
		out.println("<html><body><table>");
		out.println("<th><b>Ordered Book</b></th>");
		
		while(i<dataFromPage.length){
			
			out.println("<tr>");
			out.println("<td>"+dataFromPage[i]+"</td>");
			out.println("</tr>");
			i++;
		}
		out.println("</table></body></html>");
		
	}
	
	
//	TODO:2 	Provide call-back method (called by web container) for HTTP request made using HTTP GET method
//	TODO:3	This method should read products selected by web-client from bookCatelogue.html and 
//					display them in tabular format as html response to the web client.	
}









