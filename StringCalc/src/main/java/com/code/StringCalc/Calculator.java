package com.code.StringCalc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public int StringCalculator(String inputOne) throws NegativeNumber{
		
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
		
		if(element.length==1&& Integer.parseInt(element[0])>=0) {
			String s2=element[0];
			return Integer.parseInt(s2);
		}
		
		else {
			int sum1=0;
			int count=0;
			List l1=new ArrayList();
			for(int i=0;i<element.length;i++) {
					if(Integer.parseInt(element[i])<0) {
						l1.add(i);
						count+=1;
					}
					else if("".equals(element[i])||Integer.parseInt(element[i])>1000) { 
					  continue; 
					  }
					else{
						sum1+=Integer.parseInt(element[i]);
					}
			}
			if(count>0) {
				String negNumbers="";
				for(Object neg:l1) {
					negNumbers+=" "+element[(Integer)neg];
				}
				throw new NegativeNumber("Number cannot be negative"+negNumbers);
			}
			return sum1;
		}
	}
	
	
}