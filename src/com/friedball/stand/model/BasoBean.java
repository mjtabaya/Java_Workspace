package com.friedball.stand.model;

import java.util.LinkedList;
import java.util.Queue;

public class BasoBean {
	private Queue<Palamig> ininom;
	
	public BasoBean() {
		ininom = new LinkedList<>();
	}
	
	public void tusok(Palamig palamig) {
		ininom.add(palamig);
	}
	
	public Palamig pickOff() {
		return ininom.remove();
	}

}
