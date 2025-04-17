package com.javaex.ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		int myAge;   //선언 ex)myAge에 4칸준다
		myAge = 25; //초기화(값을 처음 넣는것) myAge에 25값을 넣는다
		
		System.out.println(myAge); //화면출력 myAge를 화면에 출력한다
		
		myAge = 26;
		
		System.out.println(myAge);
	
		/*******************************/
		
		byte no;
		no = 127;       //byte: -128~127
		System.out.println(no);
		
		/*******************************/
		
		/*
		  long형 int 범위까지는 L을 붙이지 않아도 된다. 
		  int 범위를 벗어나는 경우 L을 붙인다. 
		  ==>L을 붙여서 쓴다
		*/
		
		long no2;
		/* no2 = 2147483648; int값을 넘었을 때 */
		no2 = 2147483648L;
		System.out.println(no2);
		
	}
	
	
	
}
