package ch04.sec02;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; //1~6
		
		if (num==1) {
			System.out.println("1번");
		} else if (num==2) {
			System.out.println("2번");
		} else {
			System.out.println("나머지");
		}
		
	}
}
