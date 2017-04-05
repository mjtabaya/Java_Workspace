package com.friedball.stand.model;

import java.util.LinkedList;
import java.util.Queue;

public class TusokBean {
	private Queue<FriedBall> nakatusok;
	
	public TusokBean() {
		nakatusok = new LinkedList<>();
	}
	
	public void tusok(FriedBall ball) {
		nakatusok.add(ball);
	}
	
	public FriedBall pickOff() {
		return nakatusok.remove();
	}

}
