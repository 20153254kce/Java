package ch04.sec03;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1 :
			System.out.println("1번");
			break;
		case 2 :
			System.err.println("2번");
		default :
			System.out.println("3, 4, 5, 6번 중 하나입니다.");
		}
	}
}
