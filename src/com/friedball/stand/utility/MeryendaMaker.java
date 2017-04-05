package com.friedball.stand.utility;

import com.friedball.stand.model.*;
import com.friedball.stand.factory.FactoryProducer;

public class MeryendaMaker {
	
	public static Meryenda makeMeryenda (String tinusok, String sinawsawan, String ininom, String meryendaCode) {
		return new Meryenda (produceFriedBall(tinusok), produceSauce(sinawsawan), producePalamig(ininom), meryendaCode);
	}
	
	private static FriedBall produceFriedBall(String tinusok) {
		String ballWanted = FriedBallValues.friedBallMap.get(tinusok);
		FriedBall friedBall = FactoryProducer.getFactory("ball").getFriedBall(ballWanted);
		return friedBall;
	}
	
	private static Sauce produceSauce(String sinawsawan) {
		String sauceWanted = SauceValues.sauceMap.get(sinawsawan);
		Sauce sauce = FactoryProducer.getFactory("sauce").getSauce(sauceWanted);
		return sauce;
	}
	
	private static Palamig producePalamig(String ininom) {
		String palamigWanted = PalamigValues.palamigMap.get(ininom);
		Palamig palamig = FactoryProducer.getFactory("palamig").getPalamig(palamigWanted);
		return palamig;
	}

}