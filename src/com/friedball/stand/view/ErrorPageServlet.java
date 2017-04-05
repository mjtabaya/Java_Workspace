package com.friedball.stand.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/error.html")
public class ErrorPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//print to html if parameters were interpreted, stored and retrieved correctly
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>");
		out.print("<link rel='stylesheet' href='css/indexStyles.css'>");
		out.print("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.6.3/angular.min.js'></script>");
		out.print("<script src='js/angular.min.js'></script>");
		out.print("<script src='js/angular-controller.js'></script>");
		out.print("<meta charset='ISO-8859-1'>");
		out.print("<title>Fried Ball Stand - Abstract Factory Demo</title>");
		out.print("<body>");
		out.print("	<div class='container'>");
		
		out.print("	<section class='row\'>");
		
		String message = "Something went wrong - ";
		
		int errorCode = Integer
			.parseInt(request.getParameter("errCode"));
		
		switch(errorCode) {
			case 1:
				message += "Ay, di kami naluto ng ganyan dito.";
				break;
			case 2:
				message += "Iba ata trip mong sawsawan.";
				break;
			case 3:	
				message += "Gulaman nlng pre.";
				break;
			case 4:	
				message = "The requested URL was not found on this server. That&apos;s all we know.";
				break;	
		}
		
		out.print("<h3><font color='red'>" + message + "</font></h3>");
		
		out.print("	</section>");
		out.print("	</div>"); //container closing div
		
		out.print("		<hr>");
		
		out.print("<form action='index.html'>");
		out.print("	<input type='submit' value='<< GO BACK >>'/>");
		out.print("</form>");		
		
		out.print("</body>");
		out.print("</html>");
		out.print("");
	}

}
