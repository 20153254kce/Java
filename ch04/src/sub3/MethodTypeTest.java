package sub3;
/**
 * 날짜 : 2026/04/28
 * 이름 : 강채은
 * 내용 : Java 메소드 형태 실습*/

public class MethodTypeTest {
	public static void main(String[] args) {
		double y1 = type1(1.3);
		double y2 = type1(1.2);
		System.out.println(y1);
		System.out.println(y2);
		
		type2(true);
		type2(false);
		type2(2>3); //거짓 false
		type2(3<7); //참 true
		
		boolean result = type3();
		System.out.println("result 반환값 : " + result);
		
		type4();
	}
	
	// 타입1 - 메개변수 O, 반환값 O
	public static double type1(double radius) {
		double y = radius * radius * 3.14;
		return y;
	}
	
	// 타입2 - 메개변수 O, 반환값 X
	public static void type2(boolean isOk) {
		if(isOk) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
	}
	
	// 타입3 - 메개변수 X, 반환값 O
	public static boolean type3() {
		int num = 0;
		
		if(num>0) {
			return true;
		} else {
			return false;
		}
	}
	
	// 타입4 - 메개변수 X, 반환값 O
	public static void type4() {
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원넓이 : " + result);
	}
	
}
