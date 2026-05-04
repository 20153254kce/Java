package sub4;

public class Truck extends Car {
	
	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}
	
	public void load(int capacity) {
		this.capacity = capacity;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("차량속도 : " + this.speed);
		System.out.println("차량적재량 : " + this.capacity);
		
	}
}