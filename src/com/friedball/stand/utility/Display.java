package com.friedball.stand.utility;

import com.friedball.stand.model.*;

public class Display 
{
	public static String imageLink(String code)
	{
		System.out.println("check.. calling Display.imageLink(" + code + ").");
		return ImageMatcher.getImage(code);
	}
	
	public static String stringBall(FriedBall ball)
	{
		switch(ball.getClass().getName())
		{
			case ModelValues.FSB:
				return ((Fishball)ball).laman();
			case ModelValues.SQB:
				return ((Squidball)ball).laman();
			case ModelValues.CHB:
				return ((Chickenball)ball).laman();
			case ModelValues.KKM:
				return ((Kikiam)ball).laman();
			case ModelValues.KWK:
				return ((KwekKwek)ball).laman();
			default:
				return "Walang barya.";
		}
	}
	
	public static String stringSauce(Sauce sauce)
	{
		switch(sauce.getClass().getName())
		{
			case ModelValues.MSS:
				return ((ManongsSpecialSauce)sauce).taste();
			case ModelValues.SMG:
				return ((SukangMaanghang)sauce).taste();
			case ModelValues.SWS:
				return ((Suka)sauce).taste();
			case ModelValues.NSC:
				return ((NoSauce)sauce).taste();
			default:
				return "Walang sawsawan.";
		}
	}
	
	public static String stringPalamig(Palamig palamig)
	{
		switch(palamig.getClass().getName())
		{
			case ModelValues.GLM:
				return ((Gulaman)palamig).gulp();
			case ModelValues.BPN:
				return ((BukoPandan)palamig).gulp();
			case ModelValues.BKJ:
				return ((BukoJuice)palamig).gulp();
			case ModelValues.PNJ:
				return ((PineappleJuice)palamig).gulp();
			default:
				return "Walang baso.";
		}
	}
}
