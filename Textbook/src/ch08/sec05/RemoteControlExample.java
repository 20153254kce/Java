package ch08.sec05;

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
	}

}
