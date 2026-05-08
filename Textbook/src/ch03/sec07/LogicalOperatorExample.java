package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		
		int charCode = 'A';
		if ((65 <= charCode) & (charCode <= 90)) {
			System.out.println("대문자시군요.");
		}
		
		int charCode2 = 'a';
		if ((97 <= charCode2) & (charCode2 <= 122)) {
			System.out.println("소문자시군요.");
		}
		
		int charCode3 = '5';
		if ((48 <= charCode3) && (charCode3<=57)) {
			System.out.println("0~9 숫자이군요.");
		}
		
		int value = 6;
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수입니다.");
		}
		
		int value2 = 7;
		boolean res = (value2%2==0) || (value2%3==0);
		if(!res) {
			System.out.println("2 또는 3의 배수가 아닙니다.");
		}
	}
}
