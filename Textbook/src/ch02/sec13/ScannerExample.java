package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y 값 입력 : ");
		int y = sc.nextInt(); //어차피 숫자만 읽어서 enter 스루함
		
		sc.nextLine(); //nextInt는 엔터 인식을 못하기 때문에 사용 후에 문자열 입력 받을 일이 있으면 꼭 nextLine() 사용
		
		int result = x+y;
		System.out.println(result);
		
		while(true) {
			System.out.print("입력 문자열 : ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열 : " + data);
		}
		System.out.println("종료");
		sc.close();
	}
}


