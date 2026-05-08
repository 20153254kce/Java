package ch06.sec10.exam01;

public class CalculatroExample {
	public static void main(String[] args) {
		double res1 = 10*10*Calculator.pi; //정적 메소드는 생성자 없이 바로 참조 가능
		int res2 = Calculator.plus(10, 5);
		int res3 = Calculator.minus(10, 5);
		
		System.out.println(res1);
		System.out.println(res2);
		
	}
}
