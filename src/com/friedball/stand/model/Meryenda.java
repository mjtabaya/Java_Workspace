package com.friedball.stand.model;

public class Meryenda {
	FriedBall friedBall;
	Sauce sauce;
	Palamig palamig;
	String meryendaCode;
	
	public Meryenda(FriedBall friedBall, Sauce sauce, Palamig palamig, String meryendaCode) {
		this.friedBall = friedBall;
		this.sauce = sauce;
		this.palamig = palamig;
		this.meryendaCode = meryendaCode;
	}

	public FriedBall getFriedBall() {
		return friedBall;
	}

	public void setFriedBall(FriedBall friedBall) {
		this.friedBall = friedBall;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Palamig getPalamig() {
		return palamig;
	}

	public void setPalamig(Palamig palamig) {
		this.palamig = palamig;
	}

	public String getMeryendaCode() {
		return meryendaCode;
	}

	public void setMeryendaCode(String meryendaCode) {
		this.meryendaCode = meryendaCode;
	}
	
	
}
