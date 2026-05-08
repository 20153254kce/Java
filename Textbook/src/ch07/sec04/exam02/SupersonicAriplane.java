package ch07.sec04.exam02;

public class SupersonicAriplane extends Airplane{
	
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); //Airplane의 객체 호출
		}
		
	}
	
	
}
