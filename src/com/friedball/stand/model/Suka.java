package com.friedball.stand.model;

public class Suka extends NamedFood implements Sauce {
	
	public Suka() {
		setFoodName("Suka");
	}
	
	@Override
	public String toString() {
		return getfoodName();
	}
	
	@Override
	public String taste() {
		return "ASIMMMMMMMMMmmmmmmmmm!!!";
	}
}
