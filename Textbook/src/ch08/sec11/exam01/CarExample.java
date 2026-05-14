package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		myCar.run();
		
		//타이어 교체
		myCar.tire1 = new KumhoTire(); //한국타이었는데 금호타이어로 교체
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
	}

}
