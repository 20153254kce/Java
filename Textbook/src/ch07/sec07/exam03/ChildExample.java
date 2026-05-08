package ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); //자동 타입 변환 (자식 클래스가 부모 클래스로 자동 변환 -> 부모 클래스만 사용)
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent; //자식클래스를 부모 클래스로 강제 변환
		
		child.field2 = "data2";
		child.method3();
	}
}
