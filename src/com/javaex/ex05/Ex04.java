package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		
		int intArray[] = new int[] {3,6,9};
		//int intArray[] = new int[3];
		
		/*
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		*/
		
		for(int i=0; i<3; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("-----------------------------");
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("-----------------------------");
		System.out.println(intArray.length);
		
		
	}
}
