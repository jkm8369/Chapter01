package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("---------------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "";
		String str = "굿모닝";
		String name = "조강민";
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(5+3);
		System.out.println("굿모닝"+"조강민");
		System.out.println(str + name + str);
		
		System.out.println(i + i); // 정수 + 정수
		System.out.println(i + d); // (정수 -> 실수) ==> 실수(자동 형변환) + 실수 
		System.out.println(str + d);
		
		String result = name + d;   // (문자열 + 정수 ==> 문자열),  (문자열 + 실수 ==> 문자열)
		System.out.println(result);
		
		//굿모닝랑황일영
		System.out.println(str + "랑" + name);
		
		//굿모닝 랑 황일영
		System.out.println(str + " 랑 " + name);
		
		//굿모닝 황일영
		System.out.println(str + " " + name);
		
		//제 이름은 조강민 입니다.
		System.out.println("제"+" 이름은 "+name+" 입니다.");
		
		System.out.println("---------------------");
		System.out.println(c); // 한
		System.out.println(c+c);  //한한(x)     char형(코드값 숫자로 관리)은 + 숫자더하기
		
		//제 이름은 "조강민"입니다.
		System.out.println("제 이름은 \""+ name + "\" 입니다.");  // ==> \" --> "로 표시됨
		//제 이름은 '조강민'입니다.
		System.out.println("제 이름은 '" + name + "'입니다.");
		
		//제 이름은 \조강민\ 입니다.
		System.out.println("제 이름은 \\"+ name + "\\입니다.");  //  ==> \는 \\를 써준다
		
		System.out.println("제 이름은\t "+ name + "입니다.");
		System.out.println("나의 이름은\t" + name + "입니다.");  // ==> \t는 tap(8칸) 띄어쓰기 해줌
		
		System.out.println("나의 이름은\n" + name + "입니다.");  // ==> \n은 줄을 바꿔줌
		
	}
}
