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
	
}
