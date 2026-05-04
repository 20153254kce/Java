package sub4;

public class Sedan extends Car {
	
	private int cc;

	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); //부모 Car의 생성자 호출
		this.cc = cc;
		// TODO Auto-generated constructor stub
	}
	
	public void Drive() {
		System.out.println("Sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.Show(); //super 생략 가능
	}
	
}
