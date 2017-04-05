package com.friedball.stand.model;

public class Chickenball extends NamedFood implements FriedBall {
	
	public Chickenball() {
		setFoodName("Chickenball");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String laman() {
		return "Malaki pag mainit, pag lumamig maliit.";
	}
}
