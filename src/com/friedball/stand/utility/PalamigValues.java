package com.friedball.stand.utility;

import java.util.HashMap;

public interface PalamigValues {
	
	final String GLM = "Gulaman";
	final String BPN = "Buko Pandan";
	final String BKJ = "Buko Juice";
	final String PNJ = "Pineapple Juice";
	final String NJC = "No Juice";
	
	final HashMap<String, String> palamigMap = new HashMap<String, String>() {
		private static final long serialVersionUID = 3L;
		{
		   put("GLM", GLM);
		   put("BPN", BPN);
		   put("BKJ", BKJ);
		   put("PNJ", PNJ);
		   put("NJC", NJC);
		}};
	
}