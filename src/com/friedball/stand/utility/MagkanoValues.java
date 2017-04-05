package com.friedball.stand.utility;
import java.math.BigDecimal;
import java.util.HashMap;

public interface MagkanoValues {
	final HashMap<String, BigDecimal> magkanoMap = new HashMap<String, BigDecimal>() {
		private static final long serialVersionUID = 4L;
		{
		   put("FSB", new BigDecimal("0.50"));
		   put("SQB", new BigDecimal("1.00"));
		   put("CHB", new BigDecimal("2.00"));
		   put("KKM", new BigDecimal("3.00"));
		   put("KWK", new BigDecimal("3.00"));
		   
		   put("S", new BigDecimal("5.00"));
		   put("M", new BigDecimal("10.00"));
		   put("L", new BigDecimal("20.00"));
		}};
}
