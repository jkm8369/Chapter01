package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int workHour = sc.nextInt();
		int sum;   // 변수를 써주고 밑에 합해서 쓴다
		
		if(workHour<=8) {
			 sum = 10000*workHour;
			
		} else {
			 sum = ( 80000 + (15000*(workHour-8)) );
			
		}
		
		System.out.println("임금은 " + sum + "원 입니다.");
		
		
		sc.close();
	}

}
