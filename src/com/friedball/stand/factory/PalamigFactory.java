package com.friedball.stand.factory;

import com.friedball.stand.model.FriedBall;
import com.friedball.stand.model.Gulaman;
import com.friedball.stand.model.BukoJuice;
import com.friedball.stand.model.BukoPandan;
import com.friedball.stand.model.Palamig;
import com.friedball.stand.model.PineappleJuice;
import com.friedball.stand.model.NoJuice;
import com.friedball.stand.model.Sauce;
import com.friedball.stand.utility.PalamigValues;

public class PalamigFactory implements FriedBallCreator, AbstractFactoryForFriedBallAndSauce {

	public FriedBall getFriedBall(String gustongFriedBall) 
	{
		return null;
	}

	public Sauce getSauce(String gustongSauce) {
		return null;
	}
	
	public Palamig getPalamig(String gustongPalamig) 
	{
		Palamig palamig = null;
		
		switch(gustongPalamig) 
		{
			case PalamigValues.GLM:
				palamig = new Gulaman();
				break;
			case PalamigValues.BPN:
				palamig = new BukoPandan();
				break;
			case PalamigValues.BKJ:
				palamig = new BukoJuice();
				break;
			case PalamigValues.PNJ:
				palamig = new PineappleJuice();
				break;
			case PalamigValues.NJC:
				palamig = new NoJuice();
				break;
			default:
				break;
		}
		
		return palamig;
	}
}
