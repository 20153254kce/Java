package sub2;

public class MethodTest {
	
	//메인 메서드 : Java 프로그램 시작 함수
	public static void main(String[] args) {
		//메서드 호출(call)
		int y1 = f(1); //메서드 f 호출하면서 메개변수 x 인자값 1 전달
		int y2 = f(2);
		System.out.println(y1);
		System.out.println(y2);
		
		hello("강채은");
	}
	
	//메서드 정의(Define)
	public static int f(int x) { //반환타입, 메서드명, 메개변수
		int y = 2 * x + 3;
		
		return y;
	}
	
	public static void hello(String name) {
		System.out.println(name + "님 반갑습니다.");
	}
}
