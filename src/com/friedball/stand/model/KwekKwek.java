package com.friedball.stand.model;

public class KwekKwek extends NamedFood implements FriedBall {
	
	public KwekKwek() {
		setFoodName("Kwekkwek");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	public String laman() {
		return "Masarap.";
	}
}
