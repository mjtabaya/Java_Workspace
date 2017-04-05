package com.friedball.stand.utility;

import java.util.HashMap;

public interface ModelValues {
	String FSB = "com.friedball.stand.model.Fishball";
	String SQB = "com.friedball.stand.model.Squidball";
	String CHB = "com.friedball.stand.model.Chickenball";
	String KKM = "com.friedball.stand.model.Kikiam";
	String KWK = "com.friedball.stand.model.KwekKwek";
	String NBL = "com.friedball.stand.model.NoBalls";
	String MSS = "com.friedball.stand.model.ManongsSpecialSauce";
	String SMG = "com.friedball.stand.model.SukangMaanghang";
	String SWS = "com.friedball.stand.model.SweetSauce";
	String NSC = "com.friedball.stand.model.NoSauce";
	String GLM = "com.friedball.stand.model.Gulaman";
	String BPN = "com.friedball.stand.model.BukoPandan";
	String BKJ = "com.friedball.stand.model.BukoJuice";
	String PNJ = "com.friedball.stand.model.PineappleJuice";
	String NJC = "com.friedball.stand.model.NoJuice";
	
	final HashMap<String, String> modelMap = new HashMap<String, String>() {
		private static final long serialVersionUID = 1L;
		{
		   put("FSB", "com.friedball.stand.model.Fishball");
		   put("SQB", "com.friedball.stand.model.Squidball");
		   put("CHB", "com.friedball.stand.model.Chickenball");
		   put("KKM", "com.friedball.stand.model.Kikiam");
		   put("KWK", "com.friedball.stand.model.KwekKwek");
		   put("NBL", "com.friedball.stand.model.NoBalls");
		   put("MSS", "com.friedball.stand.model.ManongsSpecialSauce");
		   put("SMG", "com.friedball.stand.model.SukangMaanghang");
		   put("SWS", "com.friedball.stand.model.SweetSauce");
		   put("NSC", "com.friedball.stand.model.NoSauce");
		   put("GLM", "com.friedball.stand.model.Gulaman");
		   put("BPN", "com.friedball.stand.model.BukoPandan");
		   put("BKJ", "com.friedball.stand.model.BukoJuice");
		   put("PNJ", "com.friedball.stand.model.PineappleJuice");
		   put("NJC", "com.friedball.stand.model.NoJuice");
		}};
}