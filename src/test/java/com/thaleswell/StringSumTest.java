package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringSumTest {

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
