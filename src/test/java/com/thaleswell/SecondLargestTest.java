package com.thaleswell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondLargestTest {

	@Test
	void secondLargestTest1() {
		int[] arr = {1,2,3};
		
		int expected = 2;
		int actual = Main.secondLargest(arr);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void secondLargestTestWithVarArg() {
		int expected = 2;
		int actual = Main.secondLargest(1,2,3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void secondLargestDescriptionTestCase1() {
		int expected = 10;
		int actual = Main.secondLargest(10,15,5);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void secondLargestDescriptionTestCase2() {
		int expected = 500;
		int actual = Main.secondLargest(100,999,500);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void secondLargestTest2() {
		int[] arr = {11896,
				14774,
				17100,
				17514,
				19894,
				1104,
				19355,
				1497,
				19497,
				4810};
		int expected = 19497;
		
		int actual = Main.secondLargest(arr);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void secondLargestTestWithNegatives() {
		int[] arr = new int[] {
				-8414,
				3641,
				9948,
				1350,
				10268,
				-4624,
				17452,
				-15683,
				5268,
				13487};
		int expected = 13487;
		
		int actual = Main.secondLargest(arr);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void secondLargestException() {
		int[] arr = new int[] {1};

	    assertThrows(ArrayIndexOutOfBoundsException.class, 
                     () -> Main.secondLargest(arr));
	}
	
	@Test
	void secondLargestExceptionWithVarArg() {

	    assertThrows(ArrayIndexOutOfBoundsException.class, 
                     () -> Main.secondLargest(1));
	}
	
	@Test
	void secondLargestExceptionEmptyArray() {
		int[] arr = {};

	    assertThrows(ArrayIndexOutOfBoundsException.class, 
                     () -> Main.secondLargest(arr));
	}
	
	@Test
	void secondLargestExceptionEmptyVarArg() {
	    assertThrows(ArrayIndexOutOfBoundsException.class, 
                     () -> Main.secondLargest());
	}
}
