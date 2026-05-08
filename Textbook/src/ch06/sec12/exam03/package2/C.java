package ch06.sec12.exam03.package2;

import ch06.sec12.exam03.package1.*;

public class C {
	public C () { //클래스 안에 생성자가 있으면 메서드 실행 가능함!
		A a = new A();
		
		a.field1 = 1;
		a.method1();
	}
}
