package sub2;

public class Car {

	//속성(멤버 변수) : 무조건 private 설정
	private String brand;
	private String color;
	private int speed;
	
	//생성자 : 속성을 초기화하는 메서드
	public Car(String brand, String color, int speed) {
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	public Car() {
        // 기본 생성자: 매개변수 없이 객체를 생성할 수 있게 해줌
    }
	
	// getter : 외부에 안전한게 속성 제공
	public String getColor() {
		return color;
	}
	
	// setter : 생성자 대신 초기화 or 초기화된 속성값 수정
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//기능
	public void speedUp(int speed) { //클래스의 메서드로 정의하면 static이 빠짐
		speed += speed;
	}
	
	public void speedDown(int speed) {
		speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.brand);
		System.out.println("색상명 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
	
}
