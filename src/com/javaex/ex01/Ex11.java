package com.javaex.ex01;

public class Ex11 {
	public static void main(String[] args) {
		
		//논리 연산자
		int a = 5;
		int b = 7;
		System.out.println("--------&& 연산자(엄격, 깐깐)----------------");
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println("--------|| 연산자(너그럽다)----------------");
		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		System.out.println("-----! 연산자(반대)----------------");
		
		System.out.println(!true); // false
		System.out.println(!false); // true
		
		System.out.println("---------응용 ----------------");
		boolean result =(a<b) && (a>b);  //5<7 && 5>7 => t && f => false
		System.out.println(result);
		
		System.out.println(true && false || true); // true
		System.out.println(true || false || true); // true
		
		System.out.println( !(a>b) ); // 5>7 -> f !f-->t
		
		
		
	}
}
