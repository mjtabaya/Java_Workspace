package com.friedball.stand.utility;
import java.sql.*; //mysql-connector-java.bin added as a user library to the project

public class SingletonDBConnection {
	
	//the connection object is the targeted instance to act as singleton
	private static Connection connection;
	
	private SingletonDBConnection() {
		//with the constructor declared as private, 
		//the use of the "new" keyword outside this class when creating an instance of this class is not applicable.
	}
	
	private static Connection getConnectionInstance() {
		System.out.println("\n\ngetConnectionInstance start..");
		if (connection == null)
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meryendadb", "root", "");
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return connection;
	}
	
	public static Connection getConnection(){
		if(connection==null) {
			return getConnectionInstance();
		}
		else
		{
			return connection;
		}
		//return (connection==null) 
		//? getConnectionInstance()
		//: connection;
	}

}