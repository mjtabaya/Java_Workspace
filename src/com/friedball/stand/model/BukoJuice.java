package com.friedball.stand.model;

public class BukoJuice extends NamedFood implements Palamig {
	
	public BukoJuice() {
		setFoodName("Buko Juice");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}

	@Override
	public String gulp() {
		return "BJ nga naman.";
	}
}
