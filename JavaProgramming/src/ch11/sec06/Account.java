package ch11.sec06;

public class Account {
	// Field 선언
	private long balance;
	
	// Constructor 선언
	public Account() {
	}
	
	// Method 선언
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) throws InSufficientException{
		if(balance < amount) {
			throw new InSufficientException("잔고 부족: " + (amount-balance) + "원이 모자랍니다!");
		}
		balance -= amount;		
	}
	
	public long getBalance() {
		return balance;
	}
	
	
}
