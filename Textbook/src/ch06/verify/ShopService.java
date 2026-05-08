package ch06.verify;

public class ShopService {
	
	// 1. 클래스 내부에서 유일한 객체를 미리 만들고, 외부 접근을 막음 (private)
	//  static을 붙여서 프로그램 시작 시 딱 하나만 메모리에 올라가게 함
	private static ShopService singleton = new ShopService();

	//2. private 생성자: 외부에서 'new ShopService()'로 객체를 또 만드는 것을 원천 봉쇄
	private ShopService() {}

	//3. 외부에서 유일한 객체(singleton)를 얻을 수 있는 '유일한 통로'
	//  객체 생성 없이 호출해야 하므로 반드시 static 메서드여야 함
	public static ShopService getInstance() {
		return singleton;
	}
}
