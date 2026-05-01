package sub1;

/**
 * 날짜 : 20206/04/29
 * 이름 : 강채은
 * 내용 : Java 클래스 기본 실습
 */

public class ClassTest {
	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car();
		
		//객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car();
		
		avante.brand = "아반떼";
		avante.color = "빨강";
		avante.speed = 0;
		
		avante.speedUp(100);
		avante.speedDown(30);
		avante.show();
		
		// Account 개체 생성
		Account kb = new Account();
		
		kb.bank = "국민";
		kb.id = "3333-02-92-933";
		kb.name = "강채은";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.withDraw(500);
		kb.show();
		
		
		Account kako = new Account();
		
		kako.bank = "카카오";
		kako.id = "3333-02-92-933";
		kako.name = "강채은";
		kako.balance = 10000;
		
		kako.deposit(25000);
		kako.withDraw(1500);
		kako.show();
		
		
		Book java = new Book();
		
		java.title = "자바";
		java.author = "홍길동";
		java.copies = 10;
		
		boolean result = java.borrowbook();
		if (result) {
			System.out.println("대출성공");
			java.show();
		} else {
			System.out.println("대출실패");
			java.returnBook();
			java.show();
		}
		
		
		Member kim = new Member();
		kim.name ="강채은";
		kim.age = 14;
		kim.isActive = false;
		
		kim.activate();
		
		boolean isAdult = kim.isAudlt();
		
		if(isAdult) {
			kim.show();
			System.out.println("성인입니다.");
		} else {
			kim.show();
			System.out.println("미성년자입니다.");
		}
		
		
	}
}
