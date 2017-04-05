package com.friedball.stand.utility;

import java.util.HashMap;

public interface FriedBallValues {
	
	String FSB = "Fishball";
	String SQB = "Squidball";
	String CHB = "Chickenball";
	String KKM = "Kikiam";
	String KWK = "KwekKwek";
	String NBL = "No Balls";
	
	final HashMap<String, String> friedBallMap = new HashMap<String, String>() {
		private static final long serialVersionUID = 1L;
		{
		   put("FSB", FSB);
		   put("SQB", SQB);
		   put("CHB", CHB);
		   put("KKM", KKM);
		   put("KWK", KWK);
		   put("NBL", NBL);
		}};

}