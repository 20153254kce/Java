package ch08.sec02;

public class Television implements RemoteControl {
	@Override
	public void turnOn() { //추상메서드 재정의
		System.out.println("TV를 켭니다.");
	}
}
