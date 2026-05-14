package ch08.sec07;

public interface Service {
	//디폴트 메소드 - 구현 객체가 있어야 호출 가능
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defualtMethod2 종속 코드");
	}
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드 A");
		System.out.println("defaultMethod 중복 코드 B");
	}
	
	//정적 메소드 - 인터페이스 이름으로 직접 호출
	static void staticMethod1() { 
		System.out.println("defaultMethod1 종속 코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("defualtMethod2 종속 코드");
	}
	
	//private 정적 메소드 - 뭐든 가능
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드 C");
		System.out.println("staticMethod 중복 코드 D");
	}
}
