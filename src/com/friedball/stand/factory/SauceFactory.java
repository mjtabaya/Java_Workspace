package com.friedball.stand.factory;

import com.friedball.stand.model.FriedBall;
import com.friedball.stand.model.ManongsSpecialSauce;
import com.friedball.stand.model.NoSauce;
import com.friedball.stand.model.Palamig;
import com.friedball.stand.model.Sauce;
import com.friedball.stand.model.SukangMaanghang;
import com.friedball.stand.model.Suka;
import com.friedball.stand.utility.SauceValues;

public class SauceFactory implements FriedBallCreator, AbstractFactoryForFriedBallAndSauce {

	public FriedBall getFriedBall(String gustongFriedBall) 
	{
		return null;
	}

	public Sauce getSauce(String gustongSauce) {

		Sauce sauce = null;
		
		switch(gustongSauce) 
		{
			case SauceValues.MSS:
				sauce = new ManongsSpecialSauce();
				break;
			case SauceValues.SMG:
				sauce = new SukangMaanghang();
				break;
			case SauceValues.SKA:
				sauce = new Suka();
				break;
			case SauceValues.NSC:
				sauce = new NoSauce();
				break;
			default:
				break;
		}
		return sauce;
	}

	@Override
	public Palamig getPalamig(String gustongPalamig) {
		return null;
	}
}
