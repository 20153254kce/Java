package ch06.verify;

public class Account {
	private int balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
        return balance;
    }
	
	public void setBalance(int balance) { //setter에서는 반환을 안 함!
        if( balance < MIN_BALANCE || balance > MAX_BALANCE ) {
            return;
        }
        this.balance = balance;
    }
	
}
