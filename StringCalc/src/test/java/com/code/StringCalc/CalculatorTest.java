package com.code.StringCalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator cal=new Calculator();
	
	@Test
	public void emptyString() {
	try {
		assertEquals(0,cal.StringCalculator(""));
	}
	catch(Exception e) {
		System.out.println();
	}
	
	}

	@Test
	public void oneNumber() {
	String s1="2";
	Integer.parseInt(s1);
	try {
		assertEquals(Integer.parseInt(s1),cal.StringCalculator(s1));
	}
	catch(Exception e) {
		System.out.println();
	}
	}
	
	@Test
	public void twoNumbers() {
	String s1="1,2";
	try{
		assertEquals(3,cal.StringCalculator(s1));
	}
	catch(Exception e) {
		System.out.println();
	}
	}
	
	@Test
	public void multipleNumbers() {
	String s1="1,2,3,4,5,6";
	try{
		assertEquals(21,cal.StringCalculator(s1));
	}
	catch(Exception e) {
		System.out.println();
	}
	}
	
	@Test
	public void newLineNumber() {
	String s1="1\n2,3";
	try{
		assertEquals(6,cal.StringCalculator(s1));
	}
	catch(Exception e) {
		System.out.println();
	}
	}
	

	@Test 
	public void otherDelimiters(){ 
	String s1="//;\n1;2";
	try{
		assertEquals(3,cal.StringCalculator(s1));
	}
	catch(Exception e) {
		System.out.println();
	}
	}
	
	@Test 
	public void negativeNumberException(){ 
	String s1="//;\n1;-2;3";
	try{
		cal.StringCalculator(s1);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	
	@Test 
	public void greaterThan1000(){ 
	String s1="//;\n1;2;3;1001";
	try{
		assertEquals(6,cal.StringCalculator(s1));
	}
	catch(Exception e) {
		System.out.println();
	}
	}
	
	@Test 
	public void anyLengthDelimiter(){ 
	String s1="//***\n1***2***3***4";
	try{
		assertEquals(10,cal.StringCalculator(s1));
	}
	catch(Exception e) {
		System.out.println();
	}
	}
	 
	
}