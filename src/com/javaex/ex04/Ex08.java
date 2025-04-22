package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		
		int num = 1;
		
		boolean action = true;
		
		while( action ) {
			
			if( num%6 == 0 && num%14 == 0 ) {  //6의 배수이자 14의 배수
				
				action=false;
			}
				
			num++;
			
		}
		
		//action이 false가 되어서 한바퀴 더 돈다. 근데 false라서 들어가지 못하고 끝
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		// true가 나오면 무한 반복이지만 break로 나가게 만들어준다
		
		
		/*
		int num = 1;
		
		while( true ) {
			
			if( num%6 == 0 && num%14 == 0 ) {  //6의 배수이자 14의 배수
				
				break;
			}
				
			num++;
			
		}
		
		System.out.println(num);
		 */
		
		
		/*
		while(true) {
			
			if( 조건 =num이 6의 배수이고 14의 배수냐? ) {
				while문 탈출
			}
		}
		 */
		
		
		
		
	}
	
}
		
		
		
		
		
		
		
