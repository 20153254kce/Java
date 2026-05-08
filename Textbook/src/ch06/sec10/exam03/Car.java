package ch06.sec10.exam03;

public class Car {
	int speed; //인스턴스 필드 선언
	
	void run() { //인스턴스 메소드 선언
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		Car myCar = new Car();
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate(); //정적메소드 호출
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
