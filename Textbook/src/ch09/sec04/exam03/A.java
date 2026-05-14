package ch09.sec04.exam03;

public class A {
	public void method1(int arg) {//fianl int arg
		//로컬변수
		int var = 1; //final int var
		
		class B {
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				//arg = 2; -> final이라 수정 불가
			}
		}
		
		B b = new B();
		b.method2();
		
	}
}
