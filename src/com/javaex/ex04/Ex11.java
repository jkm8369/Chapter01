package com.javaex.ex04;

public class Ex11 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("=================");
		
		for(int i=1; i<=10; i++) {
			
			if(i==6) {
				
				// 아무것도 안함
			} else {
				
				System.out.println(i);
			}
		}
		
		System.out.println("================");
		
		for(int i=1; i<=10; i++) {
			if( i != 6 ) {
				System.out.println(i);
			}
			
		}
				
		
	}
}
				
		
		
		
		
		
		
