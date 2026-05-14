package ch11.sec02.exam01;

public class ExceptionHandleingExample2 {
	
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()); //에러 메시지 출력
			//System.out.println(e.toString()); -> 예외 종류 리턴
			//e.printStackTrace(); -> 예외 종류, 예외 발생 추적 내용 리턴
		} finally  {
			System.out.println("마무리 실행");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("프로그램 시작");
		printLength("ThisisJava");
		printLength(null);
		System.out.println("프로그램 종료");
		
	}

}
