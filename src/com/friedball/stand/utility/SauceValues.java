package com.friedball.stand.utility;

import java.util.HashMap;

public interface SauceValues {
	
	final String MSS = "Manong's Special Sauce";
	final String SMG = "Sukang Maanghang";
	final String SKA = "Suka";
	final String NSC = "No Sauce";
	
	final HashMap<String, String> sauceMap = new HashMap<String, String>() {
		private static final long serialVersionUID = 2L;
		{
		   put("MSS", MSS);
		   put("SMG", SMG);
		   put("SKA", SKA);
		   put("NSC", NSC);
		}};
}
