package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int point = sc.nextInt();
		
		if(point>=60) {
			// true일 때 해야할 일
			System.out.println("합격입니다.");
			
		}else {
			// false일 때 해야할 일 
			System.out.println("불합격입니다.");
		}
		
		
		System.out.println("프로그램 종료");
		
		
		sc.close();
	}
}
