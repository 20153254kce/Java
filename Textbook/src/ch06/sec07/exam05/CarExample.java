package ch06.sec07.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("자동차");
		System.out.println("Car1");
		System.out.println(car1.company);
		System.out.println(car1.model);
		
		Car car2 = new Car("검정", 100);
		System.out.println("Car2");
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
	}
}
