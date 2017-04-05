package com.friedball.stand.model;

public class Gulaman extends NamedFood implements Palamig {

	public Gulaman() {
		setFoodName("Gulaman");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String gulp() {
		return "Mmm, iced syrup!";
	}
}
