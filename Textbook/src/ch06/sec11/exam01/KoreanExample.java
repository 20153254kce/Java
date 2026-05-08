package ch06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("1234567-1234567", "김자바");
		
		System.out.println(k1.nation); //변경불가
		System.out.println(k1.ssn); //변경불가
		System.out.println(k1.name);
		
		k1.name = "최자바";
		System.out.println(k1.name);
	}
}
