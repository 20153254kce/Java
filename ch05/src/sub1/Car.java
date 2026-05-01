package sub1;

public class Car {

	//속성
	String brand;
	String color;
	int speed;
	
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
