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
@WebServlet("/meryendasummary.html")
public class MeryendaSummaryServlet extends HttpServlet {
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
		out.print("<link rel='stylesheet' href='css/cssparallax.css'>");
		out.print("<link rel='stylesheet' href='css/events.css'>");
		out.print("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.6.3/angular.min.js'></script>");
		out.print("<script src='js/angular.min.js'></script>");
		out.print("<script src='js/angular-controller.js'></script>");
		out.print("<meta charset='ISO-8859-1'>");
		out.print("<title>Fried Ball Stand - Abstract Factory Demo</title>");
		out.print("<body>");
		out.print("	<div class='wrapper'>");
		out.print("	<div class='ccparallaxeff'>");
		
		String imageurl = "";
		String objectString = "";
		String functionCall = "";
		
		for (int i = 0; i < 3; i++) {
			if (i<1) {
				imageurl = Display.imageLink(friedBallType);
				objectString = meryenda.getFriedBall().toString();
				functionCall = Display.stringBall(meryenda.getFriedBall());
			}
			else if (i<2) {
				imageurl = Display.imageLink(sauceType);
				objectString = meryenda.getSauce().toString();
				functionCall = Display.stringSauce(meryenda.getSauce());
			}
			else {
				imageurl = Display.imageLink(palamigType);
				objectString = meryenda.getPalamig().toString();
				functionCall = Display.stringPalamig(meryenda.getPalamig());
			}
			
			out.print("	<div id='eventsplax' class='plax ccparallax' style=\"background-image: url(\""
					+ imageurl
					+ "\");\">");			
			out.print("	<div class='container object-info'>");
			out.print(" <div class='col-md-2' id='date' >");
			out.print(" <p>" + objectString + "</p>");
			out.print(" </div>");
			out.print(" <div class='col-md-10 pull-right'>");
			out.print(" <h1>Function Call #" + i + "</h1>");
			out.print(" <p>" + functionCall + "</p>");
			out.print("</div>");
			out.print("</div>");
			out.print("</div>");
			
		}
		out.print("	</div>");
		out.print(" </div>");
		
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
