package com.friedball.stand.factory;

import com.friedball.stand.model.Sauce;

public interface SauceCreator {

	Sauce getSauce(String sauceNaGusto);
	
}