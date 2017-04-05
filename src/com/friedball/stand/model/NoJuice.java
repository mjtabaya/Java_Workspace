package com.friedball.stand.model;

public class NoJuice extends NamedFood implements Palamig {
	
	public NoJuice() {
		setFoodName("No Juice");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}

	@Override
	public String gulp() {
		return "Lilipas din ang uhaw..!";
	}
}
