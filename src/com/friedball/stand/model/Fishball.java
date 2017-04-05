package com.friedball.stand.model;

public class Fishball extends NamedFood implements FriedBall{
	
	public Fishball() {
		setFoodName("Fishball");
	}

	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String laman() {
		return "Spearfishing, more fun in the Philippines.";
	}
	
}