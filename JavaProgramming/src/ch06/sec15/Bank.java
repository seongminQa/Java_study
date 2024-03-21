package ch06.sec15;

public class Bank {
	
	// 필드 선언
	private String branch;
	
	// 생성자 선언
	// 여러 지점의 은행 지점(객체)을 생성할 수 있다.
	public Bank(String branch) {
		this.branch = branch;
	}
	
	// 메소드 선언
	public void deposit(int amount) {
		Account account = Account.getInstance();
		account.input(amount);
	}
	
	public void withdraw(int amount) {
		Account account = Account.getInstance();
		account.output(amount);
	}
	
	public void balanceInfo() {
		Account account = Account.getInstance();
		System.out.println(account.getBalance());
	}
}
