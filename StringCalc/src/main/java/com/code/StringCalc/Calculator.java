package com.code.StringCalc;

public class Calculator {

	public int StringCalculator(String inputOne) {
		
		String[] element;
		if(inputOne=="") {
			return 0;
		}
		
		if(inputOne.startsWith("//")) {
			String s5=Character.toString(inputOne.charAt(2));
			element=inputOne.substring(4).split(s5);
		}
		
		else {
			element=inputOne.split("\\n|,");
		}
		
		if(element.length==1) {
			String s2=element[0];
			return Integer.parseInt(s2);
		}
		
		else {
			int sum1=0;
			for(int i=0;i<element.length;i++) {
					if("".equals(element[i])) { 
					  continue; 
					  }
				 sum1+=Integer.parseInt(element[i]);
			}
			return sum1;
		}
	}
}
