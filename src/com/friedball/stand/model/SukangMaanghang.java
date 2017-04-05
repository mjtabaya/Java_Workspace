package com.friedball.stand.model;

public class SukangMaanghang extends NamedFood implements Sauce {
	
	public SukangMaanghang() {
		setFoodName("Sukang Maanghang");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}

	@Override
	public String taste() {
		return "Maasim at may maanghang.";
	}

}