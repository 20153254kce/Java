package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; //hobby 객체 쓰레기값
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null; //kind2에서 여전히 kind1에서 생성한 자동차 객체를 참조하고 있어서 쓰레기값이 아님
		
		System.out.println(kind2);
	}
}
