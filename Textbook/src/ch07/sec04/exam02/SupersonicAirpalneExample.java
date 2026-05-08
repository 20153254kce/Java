package ch07.sec04.exam02;

public class SupersonicAirpalneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAriplane sa = new SupersonicAriplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAriplane.SUPERSONIC; //실행안했음!
		sa.fly();
		sa.flyMode = SupersonicAriplane.NOMAL;
		sa.fly();
		sa.land();
	}

}
