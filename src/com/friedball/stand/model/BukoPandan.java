package com.friedball.stand.model;
public class BukoPandan extends NamedFood implements Palamig {
	
	String imageURL;
	
	public BukoPandan() {
		setFoodName("Buko Pandan");
	}
	
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String gulp() {
		return "Buko na, pandan pa!";
	}

}
