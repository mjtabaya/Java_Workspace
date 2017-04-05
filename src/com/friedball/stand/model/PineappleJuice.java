package com.friedball.stand.model;

public class PineappleJuice extends NamedFood implements Palamig {

	public PineappleJuice() {
		setFoodName("Pineapple Juice");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String gulp() {
		return "Wag na pen, pineapple nlng.";
	}

}