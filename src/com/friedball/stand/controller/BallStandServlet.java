package com.friedball.stand.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.friedball.stand.model.*;
import com.friedball.stand.utility.MeryendaMaker;
import com.friedball.stand.utility.MeryendaTracker;

/**
 * Servlet implementation class ProcessMeryendaServlet
 */
@WebServlet("/processmeryenda.html")
public class BallStandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Check.. BallStandServlet -- processmeryenda.html start.");
		//store passed parameter values
		String friedBallType = request.getParameter("friedBallType");
		String sauceType = request.getParameter("sauceType");
		String palamigType = request.getParameter("palamigType");
		
		String meryendaCode = friedBallType + sauceType + palamigType;
		
		//create meryenda instance to store an instance each
		Meryenda meryenda = MeryendaMaker.makeMeryenda(friedBallType, sauceType, palamigType, meryendaCode);
		//print to console if store is successful
		MeryendaTracker.checkValues(meryenda, "BallStandServlet");
		
		//object binding to the request, pass a key and a value to store
		request.setAttribute("meryendaKey", meryenda);
		
		//make a dispatcher instance, set the parameter = the next servlet's html mappingSystem.out.println("Check.. BallStandServlet -- processmeryenda.html start.");
		System.out.println("Check.. BallStandServlet -- processmeryenda.html end.");
		System.out.println("Check.. pass to meryendatodb.html.");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("meryendatodb.html");
		
		//move forward with the request containing the new attribute(meryenda object)
		dispatcher.forward(request, response);
		}

}
