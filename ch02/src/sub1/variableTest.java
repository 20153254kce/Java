package sub1;

/**
 * 날짜 : 2026/04/27
 * 이름 : 강채은
 * 내용 : 2장 Java 변수 실습 
 * */

public class variableTest {
	
	public static void main(String[] args) {
		
		//변수(variable)
		int a = 1; //a변수 선언과 초기화
		int b = 3; //b변수 선언과 초기화
		
		System.out.println("a : " + a); //형식자 안 넣을 거면 '+'
		System.out.println("b : " + b);
		
		a = 4; //재할당
		b = 7; //재할당
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		//상수(Constant) - 한번 초기화된 값으로 고정된 변수
		final int NUM = 5; // 상수는 대문자로 네이밍
		 
		System.out.println("NUM : " + NUM);

		
		
	}
}
