package ch06.sec07.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car(); //생성자 호출
		System.out.println(car1.company);
		
		Car car2 = new Car("테슬라"); //생성자 호출
		System.out.println(car2.company);
		
		Car car3 = new Car("자가용","흰색",100);
		System.out.println(car3.company + car3.model + car3.color + car3.maxSpeed);
	}
}
