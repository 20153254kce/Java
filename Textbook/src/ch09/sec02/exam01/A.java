package ch09.sec02.exam01;

public class A {
	class B{}
	
	B field = new B(); //인스턴스 필드값으로 B 객체 대입
	
	A() { //생성자
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
}
