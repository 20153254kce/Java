package ch09.sec03.exam01;

public class A {
	//정적 멤버 클래스
	static class B{};
	
	//인스턴스 필드값으로 객체 B대입
	B field1 = new B();

	static B field2 = new B();
	
	A() {
		B b = new B();
	}
	
	void method1() {
		B b = new B();;
	}
	
	static void method2() {
		B b = new B();
	}
}
