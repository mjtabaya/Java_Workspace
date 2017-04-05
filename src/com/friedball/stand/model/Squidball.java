package com.friedball.stand.model;

public class Squidball extends NamedFood implements FriedBall {

	public Squidball() {
		setFoodName("Squidball");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String laman() {
		return "Pusit!";
	}

}
