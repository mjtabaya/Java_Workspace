package com.friedball.stand.utility;

import com.friedball.stand.utility.ImageValues;

public class ImageMatcher {
	
	private ImageMatcher() {
	//with the constructor declared as private, 
	//the use of the "new" keyword outside this class when creating an instance of this class is not applicable.
	}
	
	public static String getImage(String string) {
		String url = ImageValues.imageURLMap.get(string);
		if (url!=null)
			return url;
		else
			return "Image for [" + string + "] unaivalable.";
	}
}
