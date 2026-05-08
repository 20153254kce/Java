package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new Tire(); //Tire 객체 장착
		myCar.run();
		
		myCar.tire = new HankookTire(); //한국타이어
		myCar.run();
		
		myCar.tire = new KumhoTire(); //금호타이어
		myCar.run();
	}
}
