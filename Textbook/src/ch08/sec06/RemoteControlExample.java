package ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc; //인터페이스 변수 선언
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(15);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery(); //정적 메서드 호출, 객체 생성 없이 바로 호출 가능
	}

}
