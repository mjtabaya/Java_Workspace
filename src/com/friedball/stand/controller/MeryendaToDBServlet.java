package com.friedball.stand.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.friedball.stand.model.Meryenda;
import com.friedball.stand.utility.MeryendaTracker;
import com.friedball.stand.utility.SingletonDBConnection;

/**
 * Servlet implementation class MeryendaToDBServlet
 */
@WebServlet("/meryendatodb.html")
public class MeryendaToDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Check.. MeryendaToDBServlet -- meryendatodb.html start.");

		Connection connection = SingletonDBConnection.getConnection();

		Meryenda meryenda = (Meryenda) request.getAttribute("meryendaKey");
		MeryendaTracker.checkValues(meryenda, "MeryendaToDBServlet");
		
		if (addMeryendaToDB(connection, meryenda))
			System.out.println("meryenda successfully inserted to db.");
		else
			System.out.println("Something went wrong.");
		
		//perform object binding, name a key and a value to store
		request.setAttribute("meryendaKey", meryenda);
		
		//make a dispatcher instance, set the parameter = the next servlet's html mapping
		System.out.println("Check.. MeryendaToDBServlet -- meryendatodb.html end.");
		System.out.println("Check.. pass to meryendasummary.html.");
		//RequestDispatcher dispatcher = request.getRequestDispatcher("displaymeryenda.html");
		RequestDispatcher dispatcher = request.getRequestDispatcher("meryendasummary.html");
		
		//move forward with the request containing the new attribute(meryenda object)
		dispatcher.forward(request, response);
	}
	
	public boolean addMeryendaToDB(Connection connection, Meryenda meryenda) {
		String sqlStatement = "insert into meryenda(friedball, sauce, palamig) values (?,?,?)";
		try {
			System.out.println("\nCheck.. " + sqlStatement);
			PreparedStatement prep = SingletonDBConnection.getConnection().prepareStatement(sqlStatement);
			prep.setString(1, meryenda.getFriedBall().toString());
			prep.setString(2, meryenda.getSauce().toString());
			prep.setString(3, meryenda.getPalamig().toString());
			prep.executeUpdate();
			return true;
		}
		catch(SQLException sqle) {
			return false;
		}
		catch(Exception e) {
			return false;
		}
	}

}
