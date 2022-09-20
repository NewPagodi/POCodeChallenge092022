package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringSumTest {

	
	// Verify that isDigit returns true for each of the 10 digits.
	@Test
	void isDigitTest0() {
		assertTrue(Main.isDigit('0'));
	}
	
	@Test
	void isDigitTest1() {
		assertTrue(Main.isDigit('1'));
	}
	
	@Test
	void isDigitTest2() {
		assertTrue(Main.isDigit('2'));
	}
	
	@Test
	void isDigitTest3() {
		assertTrue(Main.isDigit('3'));
	}
	
	
	@Test
	void isDigitTest4() {
		assertTrue(Main.isDigit('4'));
	}
	
	@Test
	void isDigitTest5() {
		assertTrue(Main.isDigit('5'));
	}
	
	@Test
	void isDigitTest6() {
		assertTrue(Main.isDigit('6'));
	}
	
	@Test
	void isDigitTest7() {
		assertTrue(Main.isDigit('7'));
	}
	
	
	@Test
	void isDigitTest8() {
		assertTrue(Main.isDigit('8'));
	}
	
	@Test
	void isDigitTest9() {
		assertTrue(Main.isDigit('9'));
	}
	
	// Verify there are only 10 chars where isDigit returns true.
	@Test
	void isDigitTestTotal() {
		int runningTotal = 0;
		
		for ( char c = 0 ; c < 127 ; ++c ) {
			if ( Main.isDigit(c) ) {
				++runningTotal;
			}
		}
		
		assertEquals(runningTotal, 10);
	}
	
	@Test
	void charValueTest0() {
		int actual = Main.charValue('0');
		int expected = 0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest1() {
		int actual = Main.charValue('1');
		int expected = 1;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest2() {
		int actual = Main.charValue('2');
		int expected = 2;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest3() {
		int actual = Main.charValue('3');
		int expected = 3;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest4() {
		int actual = Main.charValue('4');
		int expected = 4;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest5() {
		int actual = Main.charValue('5');
		int expected = 5;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest6() {
		int actual = Main.charValue('6');
		int expected = 6;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest7() {
		int actual = Main.charValue('7');
		int expected = 7;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest8() {
		int actual = Main.charValue('8');
		int expected = 8;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void charValueTest9() {
		int actual = Main.charValue('9');
		int expected = 9;
		
		assertEquals(expected, actual);
	}
	
	// Verify that in the entire char range, only digits have a char value
	@Test
	void charValueTotalTest() {
		int runningTotal = 0;
		
		for ( char c = 0 ; c < 127 ; ++c ) {
			runningTotal += Main.charValue(c);
		}
		
		assertEquals(runningTotal, 45);
	}
	
	
	
	@Test
	void stringSumTest01() {
		int actual = Main.stringSum("ab1231da");
		int expected = 7;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void stringSumTest02() {
		int actual = Main.stringSum("0123456789");
		int expected = 45;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void stringSumTest03() {
		int actual = Main.stringSum("e3x2nlbgk2");
		int expected = 7;
		
		assertEquals(expected, actual);
	}

	

	

}
