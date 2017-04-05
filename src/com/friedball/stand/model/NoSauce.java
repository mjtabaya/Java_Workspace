package com.friedball.stand.model;

public class NoSauce extends NamedFood implements Sauce {
	
	public NoSauce() {
		setFoodName("No Sauce");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}

	@Override
	public String taste() {
		return "May mga kumagat tpos sumawsaw pa dyan eh.";
	}
}
