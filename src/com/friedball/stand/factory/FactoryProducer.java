package com.friedball.stand.factory;

public class FactoryProducer {
	
	public static AbstractFactoryForFriedBallAndSauce getFactory(String pickedProduct) 
	{
		switch(pickedProduct.toLowerCase())
		{
			case "ball":
				return new FriedBallFactory();
			case "sauce":
				return new SauceFactory();
			case "palamig":
				return new PalamigFactory();
			default:
				return null;
		}
	}

}