package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87}; //선언 후에는 대입이 불가해 새 객체 생성
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		
		printItem(new int[] {83,90,87}); //배열을 매개값으로 주고, printItem()메소드 호출
		
	}
	
	public static void printItem(int[] scores) {
		for(int i=0; i<3; i++) {
			System.out.println(scores[i]);
		}
	}
}
