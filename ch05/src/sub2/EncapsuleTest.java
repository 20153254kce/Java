package sub2;

/**
 * 날짜 : 2026/04/29
 * 이름 : 강채은
 * 내용 : Java 캡슐화 실습*/

public class EncapsuleTest {
	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car("소나타","흰색",0); //생성자 초기화
		
		Car avante = new Car();
		avante.setBrand("티코");
		avante.setColor("빨강");
		avante.setSpeed(100);//생성자 초기화
		
		System.out.println(avante.getBrand());
		System.out.println(avante.getColor());
		System.out.println(avante.getSpeed());
		
		//객체 초기화 -> 캡슐화된 속성을 생성자로 초기화
		//sonata.brand = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		sonata.setColor("검정");
		
		
		sonata.show();
		avante.show();
		
		Account kb = new Account("국민", "55660101-388787", "강채은", 1000);
		Account kakao = new Account("카카오", "333302-92-93933", "강채은", 1000);
		
		kb.show();
		kakao.show();
		
		Book java = new Book("자바", "홍길동", 10);
		java.show();
		
		Member kang = new Member("강채은", 30, false);
		kang.show();
		
		
		//Moive 객체 생성 및 생성자 초기화
		Movie movie = new Movie("살목지", "김상민", 10.0, 300);
		Movie movie2 = new Movie("타이타닉", "제임스카메론", 7.0, 500);
		movie.showDetails();
		movie2.showDetails();
	}
}
