package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	public SmartPhone (String model, String color) {
		super(model,color); //부모 클래스 생성자에 매개변수가 있으면 반드시 작성
		//super에 이미 받았으니까 굳이 선언 안 해도 됨
		System.out.println("SmartPhone 생성자 실행");
	}
}
