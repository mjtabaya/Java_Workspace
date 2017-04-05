package com.friedball.stand.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

	private Reader(){
		//means that no object is created outside the class
	}
	
	private static BufferedReader getReader(){
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static String getString(String message) throws IOException {
		System.out.print(message);
		return getReader().readLine();
	}

}
