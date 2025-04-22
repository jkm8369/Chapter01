package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//수업시간
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		int dan = sc.nextInt();
		int i = 1;
		
		while(i<=9) {
			System.out.println(dan + " * " + i  + " = " + (dan*i) );
			
			i++;
		}
		
		
		
		
		
		
		
		/*
		수업시간
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		int dan = sc.nextInt();
		
		int i = 0;
		int index = 1;
		
		while(i<9) {
			System.out.println(dan + " * " + index + " = " + (dan*index) );
			
			i++;
			index++;
		}
		 */
		
		
		
		
		
		/*
		내가 한거
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		int index = 1;
		
		while(index<10) {
			System.out.println( dan + " * " + index + " = " +(dan*index) );
			
			index++;
		}
		 */
		
		
		sc.close();
	}
}
		
		
		
		
