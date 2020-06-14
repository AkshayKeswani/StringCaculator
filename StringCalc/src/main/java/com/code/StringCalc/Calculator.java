package com.code.StringCalc;

public class Calculator {

	public int StringCalculator(String inputOne) {
		
		String[] element=inputOne.split(",");
		if(inputOne=="") {
			return 0;
		}
		
		else if(element.length==1) {
			String s2=element[0];
			return Integer.parseInt(s2);
		}
		
		else {
			Integer i1=Integer.parseInt(element[0]);
			Integer i2=Integer.parseInt(element[1]);
			return i1+i2;
		}
		
	}
}
