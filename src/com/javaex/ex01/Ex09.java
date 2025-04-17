package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//대입연산자 =
		int a = 7;   //int a <= 7; 7을 a에 대입한다 변수 이름은 숫자로 시작할 수 없다
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------------------");
		
		//산술연산자
		int sum = a + b;
		System.out.println(sum);  // +
		
		System.out.println(a+b);  // +
		System.out.println(a-b);  // -
		System.out.println(a*b);  // *
		System.out.println(a/b);  // 7/2 = (3) --- 1
		System.out.println(a%b);  // 7/2 = 3 --- (1)
		
		System.out.println(7/2); //3
		System.out.println(7.0/2); // 7.0/2.0 => 3.5
		System.out.println(7.0/2.0); // 7.0/2.0 => 3.5
		
		System.out.println("------------------------------");
		
		//부호연산자
		int var = -3;
		int pVar = -var;  // -(-3) => 3
		System.out.println(pVar);
		
		int mVar = +var;  // +(-3) => -3
		System.out.println(mVar);
		
		System.out.println("------------------------------");
		//sysout ctrl+space bar
		
		//증감연산자
		System.out.println(a); // 7
		System.out.println(++a); // 7 -> 8  +1 출력 => 먼저 올리고 출력을 함
		System.out.println(a); // 원래 값을 바꿔버림 -> 8
		
		System.out.println(b); // 2
		System.out.println(--b); // 2 -> 1
		System.out.println(b); // 1
		
		System.out.println("------------------------------");
		
		System.out.println(a); // 8
		System.out.println(a++); // 8  +1 출력 => 출력을 하고 마지막에 올림
		System.out.println(a); // 9
		
		System.out.println(b);    // 1
		System.out.println(--b);  // 0
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		//해야 할 일을 나열  가정 먼저 가장 나중에 할지 결정
		System.out.println("------------------------------");
		
		int c = 5;
		System.out.println(++c * 2);  // +1 *2 출력 
		System.out.println(c);  // 6
		
		int d = 5;
		System.out.println(d);
		System.out.println(d++ * 2);  //  +1 *2 출력
		System.out.println(d);
		
		
		
	}
}
		
		
