package ch06.sec12.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field1 = 2;
		//a.field3 = 3; private 접근 불가
		
		a.method1(); //실행함수가 있어서 메소드 추가해줘야함
		a.method2();
		//a.method3(); private 접근 불가
	}
}
