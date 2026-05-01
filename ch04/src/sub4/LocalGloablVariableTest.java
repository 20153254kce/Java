package sub4;

/**
 * 날짜 : 2026/04/28
 * 이름 : 강채은
 * 내용 : Java 지역변수, 전역변수 실습*/


public class LocalGloablVariableTest {
	
	public static void main(String[] args) {
		int total1 = sum(1,10);
		int total2 = sum(1,100);
		
		System.out.println(total1);
		System.out.println(total2);
	}
	
	int num = 1; //전역변수, 클래스 내에 선언
	
	public static int sum(int start, int end) {
		int tot = 0; //메서드 안에서 선언된 지역변수
		
		for(int k = start; k <= end; k++) { //for문의 반복변수 K도 지역변수
			tot += k;
		}
		
		return tot;
	}
}
