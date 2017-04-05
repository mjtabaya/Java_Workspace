package com.friedball.stand.utility;
import java.math.BigDecimal;

import com.friedball.stand.model.*;

public class MeryendaTracker {
	private TusokBean tb;
	private BasoBean bb;
	private BigDecimal utang;
	
	public MeryendaTracker () {
		tb = new TusokBean();
		bb = new BasoBean();
		utang = new BigDecimal(0);
	}
	
	public void addTusok(FriedBall ball) {
		tb.tusok(ball);
		utang = utang.add(MagkanoValues.magkanoMap.get(ball.getClass().getName()));
	}
	//onClick of a ball's button, call addTusok(button-name)
	
	public TusokBean anoTinusok() {
		return tb;
	}
	//to get friedballname
	//should be MeryendaTracker.anoTinusok().pickOff().getClass().getName();
	
	public BasoBean anoIninom() {
		return bb;
	}
	//should be MeryendaTracker.anoIninom().pickOff().getClass().getName();
	
	public static void checkValues(Meryenda meryenda, String caller){
		System.out.println("--Meryenda Stored and Retrieved Values via " + caller + " --");
		System.out.println("FriedBall Instance: " + meryenda.getFriedBall());
		System.out.println("Sauce Instance: " + meryenda.getSauce());
		System.out.println("Palamig Instance: " + meryenda.getPalamig());
		System.out.println("Meryenda Code: " + meryenda.getMeryendaCode());
	}
}
