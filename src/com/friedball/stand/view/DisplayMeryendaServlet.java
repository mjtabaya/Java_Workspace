package com.friedball.stand.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.friedball.stand.model.Meryenda;
import com.friedball.stand.utility.Display;
import com.friedball.stand.utility.MeryendaTracker;

/**
 * Servlet implementation class DisplayMeryendaServlet
 */
@WebServlet("/displaymeryenda.html")
public class DisplayMeryendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//print to html if parameters were interpreted, stored and retrieved correctly
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//now perform the object retrieval stored on request
		Meryenda meryenda = (Meryenda) request.getAttribute("meryendaKey");
		MeryendaTracker.checkValues(meryenda, "DisplayMeryendaServlet");
		
		String friedBallType = meryenda.getMeryendaCode().substring(0, 3);
		String sauceType = meryenda.getMeryendaCode().substring(3, 6);
		String palamigType = meryenda.getMeryendaCode().substring(6, 9);
		
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

		out.print("	<section class='row'>");
		out.print("	<div class='col-md-4 banner-bg'>");
		out.print("		<img class='banner' src='images/spearFishing.jpg'/>");
		out.print("	</div>");
		
		out.print("	<div class='col-md-8'>");
		out.print("	<h2 class='text-center'>Meryenda Result<h2>");
		out.print("	<table class='table table-striped table-hover'>");
		
		//print 3 identical rows for meryenda data
		out.print("	<thead>");
		out.print("	<tr>");
		out.print("	<th>Image</th>");
		out.print("	<th>Instance</th>");
		out.print("	<th>Function Call</th>");
		out.print("	<tr>");
		out.print("	</thead>");
		out.print("	<tbody>");
		for (int i = 0; i < 3; i++) {
			out.print("	<tr>");
			out.print("	<td>");
			if (i<1) {
				out.print("<img class='item' src= '"+ Display.imageLink(friedBallType) + "'/></td>");
				out.print("<td>" + meryenda.getFriedBall() + "</td>");
				out.print("<td>" + Display.stringBall(meryenda.getFriedBall()) + "</td>");
			}
			else if (i<2) {
				out.print("<img class='item' src= '"+ Display.imageLink(sauceType) + "'/></td>");
				out.print("<td>" + meryenda.getSauce() + "</td>");
				out.print("<td>" + Display.stringSauce(meryenda.getSauce()) + "</td>");
			}
			else {
				out.print("<img class='item' src= '"+ Display.imageLink(palamigType) + "'/></td>");
				out.print("<td>" + meryenda.getPalamig() + "</td>");
				out.print("<td>" + Display.stringPalamig(meryenda.getPalamig()) + "</td>");
			}
			out.print("	</tr>");
		}
		out.print("	</tbody>");
		out.print(" </table>");
		out.print("	</section>");
		
		out.print("	<section class='row\'>");
		out.print("		<div class='col-md-10\'>");
		out.print("		</div>");
		out.print("		<div class='col-md-2\'>");
		out.print("		<button class='btn btn-success' onclick='location.href=\"index.html\"' type='button'>"
				+ "OMG ansarap! Isa pa nga! <span class='glyphicon glyphicon-cutlery'></span></button>");
		out.print("		</div>");
		out.print("	</section>");
		
		out.print("	</div>");//col-8 closing div
		out.print("	</section>");
		out.print("	</div>"); //container closing div
		
		out.print("		<hr>");
		out.print("	<div class='text-center'>");
		out.print("		<p><i>&copy; 2017 iACADEMY</i></p>");
		out.print("		<p>Date Accessed: " + new java.util.Date() + "</p>");
		out.print("		<p>Programmed by Manuel Abaya</p>");
		out.print("	</div>");
		
		out.print("</body>");
		out.print("</html>");
		out.print("");
	}

}
