package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int applePie = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double res = applePie - number * pieceUnit;
		System.out.println("남은 애플파이 양 : " + res); //실수 형태에서는 정확한 연산이 되지 않기 때문에 정수 형태로 해야 함
		
		int applePie2 = 1;
		int totalPieces = applePie2 * 10;
		int number2 = 7;
		
		int res2 = totalPieces - number2;
		
		System.out.println("남은 애플파이2 양 : " + res2/10.0); //실수로 나오게 하기 위해서 10이 아닌 10.0 형태로 작성
	}
}
