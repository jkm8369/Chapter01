package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("근무시간: ");
		int workHour = sc.nextInt();
		
		if(workHour<=8) {
			System.out.println("임금은 " + (10000*workHour) + "원 입니다.");
			
		} else {
			System.out.println("임금은 " + ( 80000+ (12000*(workHour-8) ) ) + "원 입니다.");
			
		}
		*/
		
		
		System.out.print("근무시간: ");
		int workHour = sc.nextInt();
		
		// ( ) 문 안쪽에서 생성된 변수는 { }문이 끝나면 사라진다
		// 따라서 { } 문 밖에서도 사용할 변수는 { } 문 밖에서 선언한다
		
		int sum;
		
		if(workHour<=8) {
			 sum = (10000*workHour);
			
		} else {
			sum = ( 80000+ (12000*(workHour-8) ) );
		}
		
		System.out.println("임금은 " + sum + "원 입니다.");
		
		
		
		
		
		
		sc.close();
	}

}
