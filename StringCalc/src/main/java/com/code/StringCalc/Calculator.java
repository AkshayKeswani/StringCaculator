package com.code.StringCalc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public int StringCalculator(String inputOne) throws NegativeNumber{
		
		String[] element;
		//Checks if String is empty
		if(inputOne=="") {
			return 0;
		}
		
		//checks if String starts with ("//") 
		if(inputOne.startsWith("//")) {
			List<String> del=new ArrayList<String>();
			String[] chk=inputOne.split("\\n");
			String s5=Character.toString(chk[0].charAt(2));
			String finalString="";
			
			//This loop checks for different single/ multi-length delimiters and assigns it to finalDel Variable.
			boolean flagCheck=false;
			for(int j=2;j<chk[0].length()-1;j++) {
				flagCheck=true;
				if(chk[0].charAt(j)==chk[0].charAt(j+1)) {
					s5+=Character.toString(chk[0].charAt(j+1));
				}
				
				else {
					del.add(s5);
					s5=Character.toString(chk[0].charAt(j+1));
				}
				if(j+1==chk[0].length()-1) {
					del.add(s5);
				}
				
			}
			String finalDel="";
			if(flagCheck) {
				for(String strr:del) {
					finalString+=strr+"|";
				}
				// concatenates multiple delimiters to single delimiter regex
				finalDel=finalString.substring(0,(finalString.length()-1));
			}
			
			else {
				finalDel=s5;
			}
			// splitting the input string on the basis of the input delimiters
			element=chk[1].split(finalDel);
			
		}
		
		//If string does not begin with ("//")
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
			List<Integer> l1=new ArrayList<Integer>();
			
			// This calculates skips empty strings and values greater than 1000 , and also calculates the Sum
			// of input numbers otherwise
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
			
			// This part checks for negative numbers and raises exception if true
			if(count>0) {
				String negNumbers="";
				for(Integer neg:l1) {
					negNumbers+=" "+element[neg];
				}
				throw new NegativeNumber("Number/Numbers cannot be negative"+negNumbers);
			}
			return sum1;
		}
	}

}