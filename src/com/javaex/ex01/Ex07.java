package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01);  // 정수끼리 나누면 값이 정수가 나온다 int/int = int
		
		double v02 = (double)5/4;  // 5.0/4 => 1.25
		System.out.println(v02);   // 5.0/4.0 => 1.25
		
		double v03 = 5/(double)4;  // 5/4.0 => 1.25
		System.out.println(v03);   // 5.0/4.0 => 1.25
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		
		double v06 = (int)1.3 + 1.8;    // 1 + 1.8 => 1.0 + 1.8
		System.out.println(v06);        // 1.3 + 1.8 = 3.1 => 3.0 (x)
		
	}
	
}
		 
		
		
		
