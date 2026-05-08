package ch05.verify;

import java.util.Scanner;

public class No9 {
	public static void main(String[] args) {
		
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			String num = sc.next();
			
			if(num.equals("1")) {
				System.out.print("학생수> ");
				int count = sc.nextInt();
				scores = new int[count];
			} else if (num.equals("2")) {
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores["+ i + "]> ");
					scores[i] = sc.nextInt();
				}
			} else if (num.equals("3")) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores["+ i + "]> " + scores[i]);
				}
			} else if (num.equals("4")) {
				int max = scores[0];
				int sum = 0;
				for (int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
						}
					sum += scores[i];
				}
				double avg = (double) sum / scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if (num.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}	
		}
		sc.close();
	}
}
