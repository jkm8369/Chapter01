package com.javaex.ex05;

public class Ex11 {

	public static void main(String[] args) {
		
		int[] lArray = new int[] {10,20,30};
		int[] rArray = new int[] {11,23,33};
		
		
			
		if(lArray.length == rArray.length) {
			// 세부 비교 갯수가 같은 상황
			for(int i=0; i<lArray.length; i++) {
				
				if(lArray[i] != rArray[i]) {
					// 값이 같으면 아무것도 안함 = 값이 다르면 뭐를 해
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}
		} else {
			System.out.println("두 배열의 크기가 다릅니다.");  // 끝
		}
	
		
		
		
		
		
		
		

	}

}
