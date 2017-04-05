package com.friedball.stand.factory;

import com.friedball.stand.model.FriedBall;
import com.friedball.stand.model.Kikiam;
import com.friedball.stand.model.KwekKwek;
import com.friedball.stand.model.NoBalls;
import com.friedball.stand.model.Palamig;
import com.friedball.stand.model.Chickenball;
import com.friedball.stand.model.Fishball;
import com.friedball.stand.model.Squidball;
import com.friedball.stand.model.Sauce;
import com.friedball.stand.utility.FriedBallValues;

public class FriedBallFactory implements FriedBallCreator, AbstractFactoryForFriedBallAndSauce {

	public FriedBall getFriedBall(String gustongFriedBall) 
	{
		FriedBall ball = null;
		
		switch(gustongFriedBall) 
		{
			case FriedBallValues.FSB:
				ball = new Fishball();
				break;
			case FriedBallValues.SQB:
				ball = new Squidball();
				break;
			case FriedBallValues.CHB:
				ball = new Chickenball();
				break;
			case FriedBallValues.KKM:
				ball = new Kikiam();
				break;
			case FriedBallValues.KWK:
				ball = new KwekKwek();
				break;
			case FriedBallValues.NBL:
				ball = new NoBalls();
				break;
			default:
				break;
		}
		
		return ball;
	}

	public Sauce getSauce(String gustongSauce) 
	{
		return null;
	}

	@Override
	public Palamig getPalamig(String gustongPalamig) {
		return null;
	}
}
