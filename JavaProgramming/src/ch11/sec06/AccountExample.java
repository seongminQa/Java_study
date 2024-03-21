package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(10000);
		
		try {
			account.withdraw(30000);	// 에러 발생! 
		} catch (InSufficientException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("남아있는 잔고는: " + account.getBalance());
		
	}

}
