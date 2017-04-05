package com.friedball.stand.model;

public class ManongsSpecialSauce extends NamedFood implements Sauce {

	public ManongsSpecialSauce() {
		setFoodName("Manong's Special Sauce");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String taste() {
		return "Antamis, parang pagmamahal niya sakin dati.";
	}

}