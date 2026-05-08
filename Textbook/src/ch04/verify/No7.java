package ch04.verify;

import java.util.Scanner;

public class No7 {
	public static void main(String[] args) {
		
		int balance = 0; 
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			Scanner sc = new Scanner(System.in);
			String bank = sc.next();
			
			
			if(bank.equals("1")) {
				System.out.print("예금액 > ");
				int deposit = sc.nextInt();
				balance += deposit;
			} else if (bank.equals("2")) {
				System.out.print("출금액 > ");
				int withdraw = sc.nextInt();
				balance -= withdraw;
			} else if (bank.equals("3")) {
				System.out.println("잔고 > " + balance);
			} else if (bank.equals("4")) break;
		}
		
		System.out.println("프로그램 종료");
		
	}

}
