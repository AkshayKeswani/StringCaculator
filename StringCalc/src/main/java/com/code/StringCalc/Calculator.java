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
			int sum1=0;
			for(int i=0;i<element.length;i++) {
				sum1+=Integer.parseInt(element[i]);
			}
			return sum1;
			
		}
		
	}
}
