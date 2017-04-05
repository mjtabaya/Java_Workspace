package com.friedball.stand.model;

public class Kikiam extends NamedFood implements FriedBall {
	
	public Kikiam() {
		setFoodName("Kikiam");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	public String laman() {
		return "Sarap sana ulamin.";
	}
}
