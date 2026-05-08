package ch06.test;

import java.util.Scanner;

public class BankAppliation {
	
	//클래스 배열 생성
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");
            
            // nextInt() 대신 Integer.parseInt(sc.nextLine())을 쓰면 엔터 문제가 안 생겨요!
            int selectNo = Integer.parseInt(sc.nextLine()); 
            
            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        } // while 끝
        System.out.println("프로그램 종료");
    } // main 메서드 끝 (여기서 닫아줘야 합니다!)
        
	private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        
        System.out.print("계좌주: ");
        String owner = sc.nextLine();
        
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(sc.nextLine());
        
        Account newAccount = new Account(ano, owner, balance);
        
        for (int i=0; i<accountArray.length; i++) {
            if(accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }
	
	private static void accountList() {
		System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");
        
        for (Account account : accountArray) {
            if (account != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
                //받아올 때는 get
            }
        }
	}
	
	private static Account findAccount(String ano) { //반환타입이 Account 클래스인 거임!
        for (Account account : accountArray) {
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
	
	private static void deposit() {
		System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(sc.nextLine());
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
        
	}
	
	private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(sc.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }
	
	
}