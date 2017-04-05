package com.friedball.stand.factory;

import com.friedball.stand.model.*;

public interface AbstractFactoryForFriedBallAndSauce {
	
	FriedBall getFriedBall(String gustongFriedBall);
	Sauce getSauce(String gustongSauce);
	Palamig getPalamig(String gustongPalamig);

}