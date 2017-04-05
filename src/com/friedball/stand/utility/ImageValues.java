package com.friedball.stand.utility;

import java.util.HashMap;

public interface ImageValues {
	//note all "interface" variables are static final by default
	String directory = "images/";
	
	String directory_balls = directory + "balls/";
	String fishBall = directory_balls + "fishball.jpg";
	String squidBall = directory_balls + "squidball.jpg";
	String chickenBall = directory_balls + "chickenball.jpg";
	String kikiam = directory_balls + "kikiam.jpg";
	String kwekKwek = directory_balls + "kwek2.jpg";
	String noBalls = directory_balls + "universe.jpg";
	
	String directory_sauces = directory + "sauces/";
	String manongsSpecialSauce = directory_sauces + "manongsspecialsauce.jpg";
	String sukangMaanghang = directory_sauces + "sukangmaanghang.jpg";
	String suka = directory_sauces + "suka.jpg";
	String noSauce = directory_sauces + "universe.jpg";
	
	String directory_palamigs = directory + "palamigs/";
	String gulaman = directory_palamigs + "gulaman.png";
	String bukoPandan = directory_palamigs + "bukopandan.jpg";
	String bukoJuice =directory_palamigs + "bukojuice.jpg";
	String pineappleJuice = directory_palamigs + "pineapplejuice.jpg";
	String noJuice = directory_palamigs + "universe.jpg";

	
	final HashMap<String, String> imageURLMap = new HashMap<String, String>() {
		private static final long serialVersionUID = 1L;
		{
		   put("FSB", fishBall);
		   put("SQB", squidBall);
		   put("CHB", chickenBall);
		   put("KKM", kikiam);
		   put("KWK", kwekKwek);
		   put("GLM", gulaman);
		   put("NBL", noBalls);
		   put("BPN", bukoPandan);
		   put("BKJ", bukoJuice);
		   put("PNJ", pineappleJuice);;
		   put("NJC", noJuice);
		   put("MSS", manongsSpecialSauce);
		   put("SMG", sukangMaanghang);
		   put("SKA", suka);
		   put("NSC", noSauce);
		}};
}