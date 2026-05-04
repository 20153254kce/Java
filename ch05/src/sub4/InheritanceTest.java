package sub4;

/**
 * 날짜 : 26/05/04
 * 이름 : 강채은
 * 내용 : Java 상속 실습
 */

public class InheritanceTest {

	public static void main(String[] args) {
		// Car 상속자에 Sedan 추가
		
		Sedan sonata = new Sedan("소나타","흰색",0,1800);
		sonata.speedUp(30);
		sonata.SpeedDown(10);
		sonata.Drive();
		
		Truck truck = new Truck("트럭", "파랑", 0, 10000);
		truck.speedUp(10);
		truck.load(100);
		truck.show();
		
		StockAccount kb = new StockAccount("KB증권", "1110-121-165", "강채은", 1000000, "삼성전자", 0, 0);
		kb.buy(10, 100000);
		kb.sell(5, 50000);
		kb.show();
		
		Doctor dc = new Doctor("홍길동", 50, "흉부외과");
		dc.work();
		
		Engineer eng = new Engineer("놀부", 40, "자동차 수리");
		eng.work();
	}
	
}
