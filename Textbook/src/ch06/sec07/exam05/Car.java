package ch06.sec07.exam05;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String model) {
		this(model, "은색", 250);
	}
	
	Car(String color, int maxSpeed) { //변수로 받을 거는 항상 입력
		this("소나타", color, maxSpeed);
	}
}
