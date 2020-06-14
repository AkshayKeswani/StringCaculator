package com.code.StringCalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		assertEquals(0,cal.StringCalculator(""));
	}

}
