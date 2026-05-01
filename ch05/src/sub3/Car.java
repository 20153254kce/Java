package sub3;

public class Car {
	//속성(멤버변수)
	private String name;
	private int speed;
	public static int count; //기본적으로 public 사용
	
	//생성자
	
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
		count++;
	}
	//기능(멤버메서드)
	
	public void speedUp(int speed) {
		this.speed = speed;
	}
	
	public static int totlaCar() {
		return count;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("현재속도 : " + this.speed);
		System.out.println("차량수 : " + this.count);
	}
}
