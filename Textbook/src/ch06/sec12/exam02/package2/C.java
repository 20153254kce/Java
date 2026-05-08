package ch06.sec12.exam02.package2;

import ch06.sec12.exam02.package1.*;


public class C {
	A a1 = new A(true);
	// A a2 = new A(1); default라서 다른 패키지에서 사용 불가
	// A a3 = new A("문자열"); private A(String s) {} <- private라 사용 불가
}
