package com.friedball.stand.model;

public class NoBalls extends NamedFood implements FriedBall {
	
	public NoBalls() {
		setFoodName("No Balls");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}

	@Override
	public String laman() {
		return "Unting tiis para makaipon..!";
	}
}
