package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		
		//관계 연산자
		int a = 5;
		int b = 3;
		
		System.out.println(a<b);  // false
		System.out.println(a>b);  // true
		
		System.out.println(a<=b); // false
		System.out.println(a>=b); // true
		
		System.out.println(a==b); // false,   5=3은 3을 5에 대입해라
		System.out.println(a!=b); // true
		
		boolean result = a==b;
		System.out.println(result); 
		

		
	}
}
