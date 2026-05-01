package sub3;
/**
 * 날짜 : 2026/04/30
 * 이름 : 강채은
 * 내용 : Java 클래스 변수, 클래스 메서드 실습*/

class Increment {
	public int num1;
	public static int num2; //클래스 변수 (정적 변수)
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println(num1);
		System.out.println(num2);
	}
}

public class SaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//클래스 변수는 객체 생성 없이 직접 접근 가능
		
		//Increment.num1 = 1 ;; //num1은 인스턴스 속성이기 때문에 객체로 접근해야 함
		Increment.num2 = 2; // num2는 클래스 변수(정적변수)기 때문에 클래스 타입으로 접근 가능
		
		//Car 객체 생성 및 초기화
		Car sonata = new Car("소나타", 0);
		Car avante = new Car("아반떼", 0);
		Car grandeur = new Car("그랜저", 0);
		
		System.out.println("전체 차량 수 : " + Car.totlaCar());
		
		sonata.show();
		avante.show();
		grandeur.show();
		
		Calc c1 = Calc.getInstance(); //싱글톤 객체 가져오기
		Calc c2 = Calc.getInstance();
		
		System.out.println("덧셈 : " + c1.plus(1,2));
		System.out.println("뺄셈 : " + c1.minus(1,2));
		System.out.println("곱셈 : " + c2.multi(4,5));
	}
}
