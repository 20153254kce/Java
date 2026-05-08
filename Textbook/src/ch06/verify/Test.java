package ch06.verify;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		MemberServiece memberService = new MemberServiece();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		//static은 객체 생성 안 해도 됨
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
		Account account = new Account();
		
		account.setBalance(300);
		System.out.println(account.getBalance());
		
		
		Car myCar = new Car();

        // 정상 속도 세팅
        myCar.setSpeed(100);
        System.out.println("현재 속도: " + myCar.getSpeed()); // 예상 결과: 100

        // 잘못된 속도 세팅 (음수)
        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed()); // 예상 결과: 100 (무시됨)

        // 잘못된 속도 세팅 (최대치 초과)
        myCar.setSpeed(500);
        System.out.println("현재 속도: " + myCar.getSpeed()); // 예상 결과: 100 (무시됨)

        // 정상 속도 세팅
        myCar.setSpeed(250);
        System.out.println("현재 속도: " + myCar.getSpeed()); // 예상 결과: 250
        
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();
        
        if (obj1==obj2) {
        	System.out.println("같음");
        } else {
        	System.out.println("다름");
        }
	
	}
}
