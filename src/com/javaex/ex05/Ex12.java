package com.javaex.ex05;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args ) {
		
		
		/*
		String[] sArray = new String[3];
		sArray[0] = "안녕하세요";
		sArray[1] = "hello";
		sArray[2] = "hi";
		*/
		
		
		System.out.println("입력된 옵션----------------------");
		
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		 */
		
		
		
		for(int i=0; i<args.length; i++) {
			
			
			
			
			
			if(args[i].equals("-v")) {
				System.out.println("버전 3.0");
			}
			
			if(args[i].equals("-d")) {
				System.out.println("만든 날짜: 2025-04-28");
			}
			
			if(args[i].equals("-n")) {
				System.out.println("만든 사람: 조강민");
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
