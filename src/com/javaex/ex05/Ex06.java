package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		double[] doubleArray = new double[3];
		
		doubleArray[0] = 3.4;
		doubleArray[1] = 6.2;
		doubleArray[2] = 9.5;
		
		for(int i=0; i<doubleArray.length; i++) {
			System.out.println(doubleArray[i]);
		}
		
		System.out.println("-----------------------------");
		
		char[] charArray = new char[3];
		
		charArray[0] = 'a';
		charArray[1] = 'b';
		charArray[2] = 'c';
		
		
		
		for(int i=0; i<charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println("-----------------------------");
		
		String[] stringArray = new String[3];
		
		stringArray[0] = "정우성";
		stringArray[1] = "유재석";
		stringArray[2] = "이효리";
		
		for(int i=0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		System.out.println("반장: " + stringArray[1]);
		
		
		
		
		
		
	}
	
}
		
		
		
