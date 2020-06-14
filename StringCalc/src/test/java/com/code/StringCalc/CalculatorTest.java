package com.code.StringCalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator cal=new Calculator();
	
	@Test
	public void emptyString() {
	assertEquals(0,cal.StringCalculator(""));
	}

	@Test
	public void oneNumber() {
	String s1="2";
	Integer.parseInt(s1);
	assertEquals(Integer.parseInt(s1),cal.StringCalculator(s1));
	}
	
	@Test
	public void twoNumbers() {
	String s1="1,2";
	assertEquals(3,cal.StringCalculator(s1));
	}
	
	@Test
	public void multipleNumbers() {
	String s1="1,2,3,4,5,6";
	assertEquals(21,cal.StringCalculator(s1));
	}
	
	@Test
	public void newLineNumber() {
	String s1="1\n2,3";
	assertEquals(6,cal.StringCalculator(s1));
	}
	

	@Test 
	public void otherDelimiters(){ 
	String s1="//;\n1;2";
	assertEquals(3,cal.StringCalculator(s1));
	}
	 
	
}
