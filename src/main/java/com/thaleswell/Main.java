package com.thaleswell;

import java.util.Arrays;

public class Main {
	
	
	public static int stringSum(String s) {
		int sum = 0;
		
		for ( int i = 0 ; i < s.length() ; ++i ) {
			char c = s.charAt(i);
			
			if ( '0' <= c && c <= '9' ) {
				sum += (int) c - 48;
			}
		}
		
		return sum;
	}
	
	public static void stringSum(int T, String[] arr ) {
		
		for ( int i = 0 ; i < arr.length ; ++i ) {
			System.out.println(stringSum(arr[i]));
		}
	}
	
	
	public static int secondLargest(int... arr) throws ArrayIndexOutOfBoundsException {
		
		int secondLargest = 0;
		Arrays.sort(arr);
		
		if ( arr.length >=2 ) {
			secondLargest =  arr[arr.length - 2];
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}

		return secondLargest;
	}

	
	
	public static void secondLargest(int N, int[][] arr) {
		
		for ( int i = 0 ; i < arr.length ; ++i ) {
			System.out.println(secondLargest(arr[i]));
		}
	}

	public static void main(String[] args) {
		int[][] intArray = {{1,2,3},{3,4,5}};
		
		secondLargest(2,intArray);
		
		String[] stringArray = {"ab1231da"};
		stringSum(1,stringArray);
		
		

	}

}
